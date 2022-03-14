package homeworkweek6;

/* Average of 3 numbers*/

import java.util.Scanner;

public class Program13AverageNumber {


    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = num.nextInt();
        System.out.println("Enter Second Number");
        int b = num.nextInt();
        System.out.println("Enter Third Number");
        int c = num.nextInt();

        System.out.println("The Average of the three number is :" + (a+b+c)/3);
    }
}
