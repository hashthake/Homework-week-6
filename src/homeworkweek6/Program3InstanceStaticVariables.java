package homeworkweek6;

/** This is a program with one static variables
 * and one instance variables
 *  and one static method*/

public class Program3InstanceStaticVariables {

    int a = 100;// instance var
    static int b = 10;// static var

    public void test() {

        System.out.println(a / b);
    }

    public static void test2(){
        Program1InstanceVariable obj1 = new Program1InstanceVariable();

        System.out.println(obj1.a*b);
    }

    public static void main(String[] args) {
        Program1InstanceVariable obj = new Program1InstanceVariable();
        obj.test();
        test2();



    }
}
