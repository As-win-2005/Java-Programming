import java.io.*;
import java.util.*;

class sum_digit{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the length of array");
int a=Integer.parseInt(br.readLine());
int arr[]=new int[a];
int arr_sum=0;

//get input from user
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<arr.length;i++){
arr[i]=Integer.parseInt(st.nextToken());
}

for(int i=0;i<arr.length;i++){
arr_sum+=arr[i];
}
System.out.println("The sum of digits is :"+arr_sum);
}
}