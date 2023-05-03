package math;

import java.util.Scanner;

public class reverseString {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       String str = scanner.next();



       String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
             reversed +=str.charAt(i);

        }
        System.out.println(reversed);
    }
}
