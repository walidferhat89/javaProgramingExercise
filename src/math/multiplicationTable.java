package math;

import java.util.Scanner;

public class multiplicationTable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive number :");
        int positiveNum = scanner.nextInt();
        System.out.println("the multiplication table of "+positiveNum+" :");
        for (int i = 1; i < 10; i++) {
            System.out.println(positiveNum+" * "+i+" :"+positiveNum*i);
        }


    }


}
