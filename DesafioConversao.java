package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
   public static void main(String[] args) {
	   
	   Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite o valor do primeiro salário: ");
	    String firstValue = scanner.nextLine().replace(",", ".");
	    
	    System.out.println("Digite o valor do segundo salário: ");
	    String secondValue = scanner.nextLine().replace(",", ".");
	    
	    System.out.println("Digite o valor do terceiro salário: ");
	    String thirdValue = scanner.nextLine().replace(",", ".");
	    	    
	    float salaryOne = Float.parseFloat(firstValue);
	    float SalaryTwo = Float.parseFloat(secondValue);
	    float SalaryThree = Float.parseFloat(thirdValue);
	    
	    float finalSalaryAverage = salaryOne + SalaryTwo + SalaryThree;
		System.out.println("A média mensal dos ultimos três salários recebidos é de: " + finalSalaryAverage / 3);


		//calcular a média dos ultimos 3 salarios 
		//devem funcionar decimais com virgula ou ponto 
		
		//(String em valor numérico)
		}
}
