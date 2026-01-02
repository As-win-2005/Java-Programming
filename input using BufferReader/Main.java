import java.util.*;
import java.io.*;
class Main{

public static void main(String args[]) throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the length of the array");
int a=Integer.parseInt(br.readLine());

int arr[]=new int[a];


System.out.println("Enter the array elements");
StringTokenizer st=new StringTokenizer(br.readLine());

for(int i=0;i<arr.length;i++){
	arr[i]=Integer.parseInt(st.nextToken());
}
StringBuilder sb=new StringBuilder();
for(int i=arr.length-1;i>=0;i--){
sb.append(arr[i]).append(" ");
}

System.out.println(Arrays.toString(arr));
System.out.println("Reversed array");
System.out.println(sb.toString());

}
}