package Fundamentos;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97; //base decimal
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = .3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
