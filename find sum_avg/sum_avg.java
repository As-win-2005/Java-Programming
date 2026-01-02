//Write a program to find sum and average of elements in an array.

import java.util.Scanner;
public class sum_avg{
static Scanner sc=new Scanner(System.in);
static int a[];
static int sumd=0,avgd=0,n;
	static void getelements(int n){
	a=new int[n];
	System.out.println("Enter the elements ");
	for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
	}
	}
		static void sum(int a[]){
	for(int i=0;i<n;i++){
	sumd+=a[i];
}
	System.out.printf("The sum of %d digits is %d",n,sumd);
	System.out.print("\n");
}
	static void avg(int avgd){
	avgd=sumd/n;
	System.out.printf("The average of %d digits is %d",n,avgd);
	System.out.print("\n");
}


public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of element to be in the array");
	n=sc.nextInt();
	getelements(n);

	sum(a);
	avg(avgd);
}
}