import java.util.*;
import java.io.*;
class matrix_even_place{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



int arr[][]={{1,2,3},{4,2,6},{7,8,9}};


StringBuilder sb=new StringBuilder();
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
	if((i+j)%2!=0){
	sb.append(" ").append(arr[i][j]).append(" ");
}
else{
sb.append(" - ");
continue;
}
}
sb.append("\n");
}

System.out.println(sb.toString());
}
}