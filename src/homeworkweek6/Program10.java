package homeworkweek6;

/** Program about input number
 * and its multiplication table up to 10
 */

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = scanner.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }
    }
}
