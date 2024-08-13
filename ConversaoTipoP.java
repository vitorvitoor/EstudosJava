package Fundamentos;

public class ConversaoTipoP {
	public static void main(String[] args) {
		
		double a = 1; // Implícita
		System.out.println(a);
		
		float b = (float) 1.1234568888; // Explícita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}

}
