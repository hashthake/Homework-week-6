package homeworkweek6;

/** This is a program with two static variables
 * and two instance varibales with
 *  one static method
 *  and one instance method*/


public class Program4BothVariabes {
    int a = 10;//instance var one
    int b = 20;//instance var two
    static int c = 30;//static var one
    static int d = 40;//static var two

    public void test1() {
        System.out.println(a + b + c + d);

    }

    public static void test2() {
        Program4BothVariabes org = new Program4BothVariabes();
        System.out.println(c + d + org.a + org.b);


    }

    public static void main(String[] args) {
        Program4BothVariabes org1 = new Program4BothVariabes();
        org1.test1();
        test2();

    }

}
