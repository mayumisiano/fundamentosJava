package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Os tipos de variáveis podem ser tanto inteiros como flutuantes
		float A,B,C;		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		A = ler.nextFloat();
		System.out.println("Entre com o valor de B: ");
		B = ler.nextFloat();
		System.out.println("Entre com o valor de C: ");
		C = ler.nextFloat();
		
		if( (A+B)< C ) {
			System.out.println("A soma de A + B é menor que C");
		}
	}

}
