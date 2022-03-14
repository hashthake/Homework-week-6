package homeworkweek6;

import java.util.Scanner;

public class Program15SwapVariables {

    /* program to swap two variables */




    public static void main(String[] args) {



        Scanner opt = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = opt.nextInt();
        System.out.println("Enter number B: ");
        int b = opt.nextInt();


       a=(a+b);
       b=(a-b);
       a=(b-a);





        System.out.println("Swap Number A" + a);
        System.out.println("Swap Number B" + b);

    }

}
