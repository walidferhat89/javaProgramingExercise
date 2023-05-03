package math;

import java.util.Scanner;

public class factorial {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact*=i;

        }
        System.out.println(fact);


        int num2 = 5;
        int fact2 = 1;

        for (int i = 1; i <= num; i++) {
            fact2 =fact2* i;

        }
        System.out.println(fact2);





        }

    }

