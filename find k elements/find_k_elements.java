import java.util.Arrays;
import java.util.*;
import java.io.*;

class find_k_elements{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int arr[];
System.out.println("Enter the length of array");
int a=Integer.parseInt(br.readLine());
arr=new int[a];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<arr.length;i++){
arr[i]=Integer.parseInt(st.nextToken());
}
System.out.println("count of which digit you need?");
int k=Integer.parseInt(br.readLine());
long count=Arrays.stream(arr).filter(x->x==k).count();
System.out.println("The count of the digit "+k+" is"+count);
}
}