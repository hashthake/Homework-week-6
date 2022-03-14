package homeworkweek6;

/* Program of upper case to lower case*/

import java.util.Scanner;

public class Program9UpperToLower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch;
        int temp;

        System.out.println("Enter a character in Upper case : ");
        ch=scanner.next().charAt(0);

        temp=(int)ch;
        temp=temp+32;
        ch=(char)temp;
        System.out.println("Lower case is :"+ch);

    }



}
