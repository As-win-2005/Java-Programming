import java.io.*;
import java.util.*;

class array_max{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the length of array");
int a=Integer.parseInt(br.readLine());
int arr[]=new int[a];
int arr_max=0;

//get input from user
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<arr.length;i++){
arr[i]=Integer.parseInt(st.nextToken());
}

for(int i=0;i<arr.length;i++){
if(arr[i]>arr_max){
arr_max=arr[i];}
}
System.out.println("The max of digits is :"+arr_max);
int max_fn;
Arrays.sort(arr);
max_fn=arr[arr.length-1];
System.out.println("The max using Array function"+max_fn);
}
}