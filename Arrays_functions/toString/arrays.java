//Create an array and print it using Arrays.toString().
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class arrays{
static Scanner sc=new Scanner(System.in);
static int n, a[];

static void getelements(int n){
a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt(); 
}
}

static void showelements(int a[]){
System.out.println("Elements showcasing using loop");
for(int x:a){
System.out.println(x);
}

System.out.println("Elements showcasing using Array function"+Arrays.toString(a));

}


public static void main(String args[]){
System.out.println("Enter the length of array");
n=sc.nextInt();
getelements(n);
showelements(a);
}}