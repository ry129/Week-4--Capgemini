package JunitTestingPrograms;

import java.util.Scanner;

public class TestingTemperatureConversions {
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
      return fahrenheit;

    }
    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        TestingTemperatureConversions temp = new TestingTemperatureConversions();
        temp.celsiusToFahrenheit(celsius);
        temp.fahrenheitToCelsius(fahrenheit);
    }
}
