package homeworkweek6;
/** This is program for radius value of circle*/

import java.util.Scanner;

public class Program6RadiusArea {
    public static void main(String[] args) {

        double radius,area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = scanner.nextDouble();
        scanner.close();

        area = Math.PI * radius * radius;

        System.out.println("Area of the Circle is " +area);
    }



}
