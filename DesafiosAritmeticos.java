package Fundamentos;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		/*
		 * int a = 2 + 3;
		 * int b = (int)Math.pow(a, 3); 
		 * double c = Math.pow(a, 3);
		 */
		
		int firstEquation = 3 + 2;
		int secondEquation = firstEquation * 6;
		int thirdEquation =  (int)Math.pow(secondEquation, 2);
		int fourthEquation = thirdEquation / (3*2);
		System.out.println("O primeiro resultado é : " + fourthEquation);
		
		int firstCalc = (1-5) * (2-7);
		int secondCalc = firstCalc / 2;
		int thirdCalc = (int)Math.pow(secondCalc, 2);
		System.out.println("O segundo resultado é: " + thirdCalc);
		
		int powerCalc = fourthEquation - thirdCalc;
		int powerResult = (int)Math.pow(powerCalc, 3);
		int anotherValue = (int)Math.pow(10, 3);
		
		System.out.println("Resultado final da operação é de: " + powerResult / anotherValue);
		
	}

}
