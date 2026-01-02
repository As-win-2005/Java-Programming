import java.util.*;
import java.io.*;
class matrix_row{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

StringBuilder sb=new StringBuilder();
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
	sb.append(arr[i][j]).append(" ");
}
sb.append("\n");
}
System.out.println(sb.toString());
}
}