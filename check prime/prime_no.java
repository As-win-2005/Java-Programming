//prime no

import java.util.*;
class prime_no{
static int n;
static Scanner sc=new Scanner(System.in);
static void check_prime(int n){

if(n<1){System.out.printf("The no %d is a prime number",n);}
else if(n>=2){
for(int i=2;i<n;i++){
if(n%i==0){
System.out.printf("The no %d is a not a prime number",n);
}
}
else{
System.out.printf("The no %d is a prime number",n);}
}





}
public static void main(String args[]){
System.out.println("Enter the no to check prime status");
n=sc.nextInt();
check_prime(n);
}
}