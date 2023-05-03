package math;

import java.util.Scanner;

public class raisedToPower {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
    int num1 = scanner.nextInt();
        System.out.println("enter the second number: ");
    int num2 = scanner.nextInt();
    int result = 1;
        for (int i = 1; i <= num2; i++) {
            result*=num1;

        }
        System.out.println(result);


    }
}
