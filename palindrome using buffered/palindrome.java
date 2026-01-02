import java.util.*;
import java.io.*;
class palindrome{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String sb=br.readLine();
System.out.println("Actual string is:"+sb);
String rev=new StringBuffer(sb).reverse().toString();

System.out.println("Reversed String:"+rev);

if(sb.equals(rev)){
System.out.println("It is palindrome");
}
else{

System.out.println("Not a palindrome");
}
}
}