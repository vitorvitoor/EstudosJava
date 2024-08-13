package Fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
        Scanner scanner = new Scanner(System.in);

		final int first_value = 32;
		final double second_value = 5.0 /9.0;
		
		System.out.println("Digite o valor em Fehrenheit: ");
		int fahrenheit = scanner.nextInt();
		double celsius = (fahrenheit - first_value) * second_value;
		
		
		System.out.println("O valor em graus Celsius é de: " + celsius);
		
		
	}
}
