//count vowel and consonents


import java.util.*;

class vowel{
static String name;
static int cvowel,cconst;
static Scanner sc=new Scanner(System.in);



static void check_vowel(String name){
name=name.toUpperCase();
for(int i=0;i<name.length();i++){

if(name.charAt(i)==' '){continue;}

else if(name.charAt(i)=='A' || name.charAt(i)=='E'|| name.charAt(i)=='I'|| name.charAt(i)=='O' || name.charAt(i)=='U')
{
cvowel++;
}
else{
cconst++;
}
}
}

public static void main(String args[]){
System.out.println("Enter the name");
name=sc.nextLine();


check_vowel(name);
System.out.printf("The no of vowel is %d and the no of consonents is %d",cvowel,cconst);

}
}