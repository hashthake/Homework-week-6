package homeworkweek6;

/** Program about temperature value in degree fahrenheit and
 * convert to degree celsius */

import java.util.Scanner;

public class Program7TemperatureValue {
    public static void main(String[] args) {
        float temp;
        System.out.println("Enter the temperature to convert in to celsius");
        Scanner scanner = new Scanner(System.in);
        temp=scanner.nextFloat();
        temp=((temp-32)*5)/9;
        System.out.println("temp in celsius"+temp);
    }


}
