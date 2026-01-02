//square of no

import java.util.*;
class squre_digit{
static int n;
static Scanner sc=new Scanner(System.in);


static void checksqr(int n){
System.out.println("The sqr of the digit is:"+Math.pow(n,2));//Math.sqrt(n) -> square root of the digit eg: 4 -> 2 Math.pow(base,power) -> give the powered values 
}

public static void main(String ar[]){
n=sc.nextInt();
checksqr(n);
}
}