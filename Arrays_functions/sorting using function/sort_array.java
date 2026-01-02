//sort integers and string


import java.util.Arrays;
import java.util.*;

class sort_array{

static int n,a[],b[];
static Scanner sc=new Scanner(System.in);

static void getelements(int n){
a=new int[n];
System.out.println("Enter the elements of the array");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
}


static void sort_use_fn(int a[]){
Arrays.sort(a);
System.out.println("Sorted using function :"+Arrays.toString(a));
}


/* static void sortarray(int a[]){
	b=Arrays.copyOf(a,n);
	for(int i=0;i<n;i++){
	if(b[i]<b[i+1]){
	int temp=b[i];
	b[i]=b[i+1];
	b[i+1]=temp;
	}
	}
	}
*/


public static void main(String args[]){
System.out.println("Enter the no of elements in the array");
n=sc.nextInt();
getelements(n);
sort_use_fn(a);
//sortarray(a);
}
}