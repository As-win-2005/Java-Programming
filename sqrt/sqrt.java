//square of no

import java.util.*;
class squre_digit{
static int n;
static Scanner sc=new Scanner(System.in);


static void checksqr(int n){
System.out.println("The sqr of the digit is:"+(n*n));
}

public static void main(String ar[]){
n=sc.nextInt();
checksqr(n);
}
}