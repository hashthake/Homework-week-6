package homeworkweek6;

import java.util.Scanner;

public class Program18SumPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));
    }





    }



