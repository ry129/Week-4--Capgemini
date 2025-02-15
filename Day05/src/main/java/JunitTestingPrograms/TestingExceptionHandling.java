package JunitTestingPrograms;

import java.util.Scanner;

public class TestingExceptionHandling {
    public static int divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException(" cannot Divide by zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        System.out.println("Enter an integer");
        int b = sc.nextInt();
        divide(a, b);
    }
}
