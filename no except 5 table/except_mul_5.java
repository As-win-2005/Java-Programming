
//Print numbers from 1 to 100, but skip multiples of 5.

import java.util.Scanner;
class except_mul_5{

static void show_values(){
for(int i=1;i<=20;i++){
	if(i%5==0){
continue;
}
System.out.println(i);
}
}

public static void main(String args[]){
show_values();
}
}