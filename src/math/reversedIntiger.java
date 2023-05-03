package math;

import java.util.Scanner;

public class reversedIntiger {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        int reversed=0;
        int pop = 0;
        while (num != 0){

            pop = num%10;
            num /= 10;
            reversed = reversed*10 + pop;
        }
        System.out.println(reversed);


    }
}
