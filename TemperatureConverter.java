import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void convertTemperature(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "celsius":
                System.out.printf("Fahrenheit: %.2f%n", celsiusToFahrenheit(value));
                System.out.printf("Kelvin: %.2f%n", celsiusToKelvin(value));
                break;
            case "fahrenheit":
                System.out.printf("Celsius: %.2f%n", fahrenheitToCelsius(value));
                System.out.printf("Kelvin: %.2f%n", fahrenheitToKelvin(value));
                break;
            case "kelvin":
                System.out.printf("Celsius: %.2f%n", kelvinToCelsius(value));
                System.out.printf("Fahrenheit: %.2f%n", kelvinToFahrenheit(value));
                break;
            default:
                System.out.println("Invalid unit. Please enter Celsius, Fahrenheit, or Kelvin.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the unit (Celsius, Fahrenheit, Kelvin): ");
        String unit = scanner.nextLine();

        convertTemperature(temperature, unit);
        
        scanner.close();
    }


}