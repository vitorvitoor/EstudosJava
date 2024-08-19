package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); // valores diferentes resultado igual
		System.out.println("2".equals(s1)); //equals compara os conteúdos
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // trim remove os espaços em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}

}
