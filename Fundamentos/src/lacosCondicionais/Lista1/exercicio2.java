package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {		
		
		Scanner ler = new Scanner(System.in);
		
		/*A variável char suporta apenas um único caracter
		 por isso, frequentemente é utilizado para distinguir
		 o sexo (F/M) e se a pessoa é casada ou solteira (C/S)*/
		
		String nome;
		char estadoCivil,sexo;		
		int tempoCasada;		
		
		System.out.println("\nInsira o nome: ");
		nome = ler.nextLine();		

		System.out.println("\nInsira o sexo: ");
		sexo = ler.next().charAt(0);	
		
		System.out.println("\nInsira o estado civil: ");
		estadoCivil = ler.next().charAt(0);			
		
		if( sexo == 'F' && estadoCivil == 'C') {
			System.out.println("Insira o seu tempo de casada em anos: ");
			tempoCasada = ler.nextInt();			
		} 
		
		/*Repare que, no IF acima, utilizaremos dois ==
		para fazer uma comparação de valores e verificar se as
		duas condições são verdadeiras. O operador && corresponde
		ao 'E' lógico no Java.*/
		
	}

}