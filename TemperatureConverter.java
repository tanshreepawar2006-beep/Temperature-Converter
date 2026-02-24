import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("---Temperature Converter---\n");
        // Taking input from user
        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().charAt(0);

        double converted;

        // Conversion logic
        if (unit == 'C' || unit == 'c') {
            converted = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + converted);
        } 
        else if (unit == 'F' || unit == 'f') {
            converted = (temperature - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + converted);
        } 
        else {
            System.out.println("Invalid unit! Please enter C or F.");
        }

        sc.close();
    }
}