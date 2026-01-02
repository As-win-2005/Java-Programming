// reverse an array

import java.util.*;
class reverse_array{
static int a[],n;
static Scanner sc=new Scanner(System.in);

static void getele(int n){
a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
}

static void reverse(int a[]){
for(int i=n-1;i>=0;i--){
System.out.println(a[i]);}
}

public static void main(String ar[]){
System.out.println("Enter the no of elements in the array");
n=sc.nextInt();
getele(n);
reverse(a);
}
}