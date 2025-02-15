package JunitTestingPrograms;
import java.util.*;
public class TestingCalculatorClass {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int subtract(int a, int b) {
        return a-b;

    }
    public static int  multiply(int a, int b) {

        return a*b;
    }
    public static int divide(int a, int b) {
      return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }
}
