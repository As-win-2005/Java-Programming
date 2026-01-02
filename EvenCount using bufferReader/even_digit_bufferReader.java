import java.util.*;
import java.io.*;
class even_digit_bufferReader{

public static void main(String args[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int evenCount=0;

System.out.println("Enter the range to calculate the even numbers");
int a=Integer.parseInt(br.readLine());
for(int i=0;i<=a;i++){
if(i%2==0)
{
	evenCount++;
}
else{evenCount+=0;}
}
System.out.print("The even count of numbers  is s "+evenCount);
}
}