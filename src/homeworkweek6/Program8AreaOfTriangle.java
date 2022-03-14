package homeworkweek6;

/* Program about count the area of a triangle*/

import java.util.Scanner;

public class Program8AreaOfTriangle {
    public static void main(String[] args) {
        int base = 0;
        int height = 0;
        int area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of base Triangle : ");
        base = scanner.nextInt();

        System.out.println("Enter height of base Triangle : ");
        height = scanner.nextInt();

        area = (base*height) / 2;
        System.out.println("The Area of Triangle is :" + area);

    }



}
