import java.util.*;
import java.io.*;

class find_index {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter the string:");
        sb.append(br.readLine());

        System.out.println("Which letter's first index:");
        String a = br.readLine();
	
        int index = sb.indexOf(a);

        System.out.println("Index is: " + index);
    }
}
