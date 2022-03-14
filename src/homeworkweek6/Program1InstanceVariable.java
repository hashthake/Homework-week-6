package homeworkweek6;


 /** This is a program with two instance variables
  *  and one instant method*/


public class Program1InstanceVariable {
    int a = 10;// instance var 1
    int b = 20;// instance var 2
    /* Instance method*/
    public void test() {
       System.out.println(a + b);


    }
    /* main method*/
    public static void main(String[] args) {
        Program1InstanceVariable obj = new Program1InstanceVariable();
        obj.test();


    }

}
