package JunitTestingPrograms;
import java.util.Scanner;
public class TestingStringUtilityMethods {
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
    public  static  boolean isPalindrome(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }
    public static String UpperCse(String input) {
        String uppercse = input.toUpperCase();
        return uppercse;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        String reversed = reverseString(input);
        System.out.println("The reversed string is: " + reversed);
        boolean palindrome = isPalindrome(input);
        System.out.println("The palindrome is: " + palindrome);
        String uppercse = UpperCse(input);
        System.out.println("The uppercse string is: " + uppercse);
    }

}
