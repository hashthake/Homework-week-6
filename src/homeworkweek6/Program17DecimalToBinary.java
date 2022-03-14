package homeworkweek6;

import java.util.Scanner;

public class Program17DecimalToBinary {
    public static void main(String[] args) {
        Scanner dec = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        int d=dec.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(d));
    }
}
