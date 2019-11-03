package application;

import java.util.Locale;
import java.util.Scanner;

import exceptions.TemperatureException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println();
			System.out.println("================== TEMPERATURE CONVERSION ==================");
			System.out.println();
			System.out.print("Which type you want to get value from? (f/c/k): ");
			char temp1 = sc.next().charAt(0);
			System.out.print("Enter value: ");
			double value = sc.nextDouble();
			System.out.print("And which type you want to convert to? (f/c/k): ");
			char temp2 = sc.next().charAt(0);
			System.out.println();
			
			if ( temp1 == 'k' && temp2 == 'c' ) {
				System.out.println(String.format("%.2f", kelvinToCelsius(value)) + " ºC");
			}
			
			if ( temp1 == 'c' && temp2 == 'k' ) {
				System.out.println(String.format("%.2f", celsiusToKelvin(value)) + " ºK");
			}
			
			if ( temp1 == 'f' && temp2 == 'c' ) {
				System.out.println(String.format("%.2f", fahrenheitToCelsius(value)) + " ºC");
			}
			
			if ( temp1 == 'c' && temp2 == 'f' ) {
				System.out.println(String.format("%.2f", celsiusToFahrenheit(value)) + " ºF");
			}
			
			if ( temp1 == 'f' && temp2 == 'k' ) {
				System.out.println(String.format("%.2f", fahrenheitToKelvin(value)) + " ºK");
			}
			
			if ( temp1 == 'k' && temp2 == 'f' ) {
				System.out.println(String.format("%.2f", kelvinToFahrenheit(value)) + " ºF");
			}
		}
		catch ( TemperatureException e ) {
			System.out.println(e.getMessage() + "Invalid data entered!");
		}
		sc.close();
	}

	public static double kelvinToCelsius(double value) {
		double celsius = value - 273.15;
		return celsius;
	}
	
	public static double celsiusToKelvin(double value) {
		double kelvin = value + 273.15;
		return kelvin;
	}
	
	public static double fahrenheitToCelsius(double value) {
		double celsius = ( value - 32 ) * 5 / 9;
		return celsius;
	}
	
	public static double celsiusToFahrenheit(double value) {
		double fahrenheit = ( ( value *  9 ) / 5  ) + 32;
		return fahrenheit;
	}
	
	public static double fahrenheitToKelvin(double value) {
		double kelvin = ((( value - 32 ) * 5) / 9) + 273.15;
		return kelvin;
	}
	
	public static double kelvinToFahrenheit(double value) {
		double fahrenheit = (((value - 273.15) * 9) / 5) + 32;
		return fahrenheit;
	}
}
