// Arrays.sort(), Arrays.toString(), Arrays.deepToString()

import java.util.Arrays;
class Sort{

public static void main(String args[]){
int a[]={2,4,8,1,0,5};
String st[]={"Ashwin","Jashwanth","Kingsly","Nanadha Gopal","Ahamad Afrith"};
int ar[][]={{1,2},{2,4}};
Arrays.sort(a);
Arrays.sort(st);
System.out.println(Arrays.toString(a)+"\n" +Arrays.toString(st)+"\n"+Arrays.deepToString(ar));
}
}

/*
| Task          | Code                                              |
| ------------- | ------------------------------------------------- |
| Normal sort   | `Arrays.sort(arr)`                                |
| Ignore case   | `Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER)` |
| Reverse order | `Arrays.sort(arr, Collections.reverseOrder())`    |



*/