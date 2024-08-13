package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//Tipos numérico inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01; 
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias?" + estaDeFerias);
		System.out.println("Status" + status);
	}
}
