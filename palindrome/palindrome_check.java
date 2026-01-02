import java.util.*;
import java.io.*;

class palindrome_check{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String sb;
sb=br.readLine();
String re=new StringBuffer(sb).reverse().toString();
if(sb.equals(re)){
System.out.println("The reversed string is "+re);}
else{
System.out.println("not palindrome");}
}

}