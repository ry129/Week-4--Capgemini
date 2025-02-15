package JunitTestingPrograms;

import java.util.Scanner;

public class TestingParameterizedTests {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(isEven(number));
    }
}
