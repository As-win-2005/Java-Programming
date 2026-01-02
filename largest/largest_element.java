//Write a program to find the largest element in an array

import java.util.*;
class largest_element{
public static int  largest,n;
static Scanner sc=new Scanner(System.in);
public static int a[];
static void getinput(int n){
a=new int[n];
System.out.println("Enter the digits ");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
}
static void check_largest(int a[]){
largest=a[0];
for(int i=0;i<n;i++){
	
	if(a[i]>=largest){
	largest=a[i];
}

}
System.out.println("The greatest element is "+largest);
}

public static void main(String args[]){

System.out.println("Enter the no of element in the array");

n=sc.nextInt();
getinput(n);
check_largest(a);

}
}