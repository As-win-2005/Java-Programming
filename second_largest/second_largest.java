import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class second_largest{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the length of array");
int a=Integer.parseInt(br.readLine());

int arr[]=new int[a];
System.out.println("Enter the elements of the array");
StringTokenizer st= new StringTokenizer(br.readLine());
for(int i=0;i<arr.length;i++){
	arr[i]=Integer.parseInt(st.nextToken());
}
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println("The second largest element is: "+arr[arr.length-2]);

}
}
