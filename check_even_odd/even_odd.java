//Write a program to count even and odd numbers in an array.

import java.util.*;
import java.util.Scanner;
class even_odd{
public static  int n,a[],odd,even;
public static Scanner sc=new Scanner(System.in);

static void getelements(int c){
a=new int[c];
for(int i=0;i<c;i++){
a[i]=sc.nextInt();
}
}

static void check_even_odd(int a[]){
for(int i=0;i<n;i++){
	if(a[i]%2==0){
	even++;
}
if(a[i]%2!=0){
odd++;
}

}
System.out.printf("The count of even digits is %d \n The count of odd digits is %d",even,odd);
}


public static void main(String args[]){
System.out.println("Enter the no of array elements");
n=sc.nextInt();
getelements(n);
check_even_odd(a);
}
}