package fundamentosLogica.Lista1;

import java.util.Scanner;

public class DadosDezPessoas {

	public static void main(String[] args) {
		float altura, maiorAltura=0, menorAltura=0, mediaAltura = 0, somaAltura = 0,
			  numeroMulheres=0,numeroHomens=0;
		char genero;		
		
		Scanner sc = new Scanner(System.in);				
		
		for( int x=0; x<=2; x++) {
			
			System.out.println("Insira seu gênero (M/F): ");
			genero = sc.next().charAt(0);
			System.out.println("Insira sua altura: ");
			altura = sc.nextFloat();
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}else if(altura > menorAltura) {
				menorAltura = altura;
			}			
			
			if(genero == 'M') {
				somaAltura += altura;
				numeroHomens++;
			}else if(genero == 'F') {
				numeroMulheres++;
			}else {
				System.out.println("Opção Inválida, digite M/F");
			}
			
			mediaAltura = somaAltura/numeroHomens;				
						
		}
		System.out.println("\nA maior altura foi: "+maiorAltura);
		System.out.println("\nA menor altura foi: "+menorAltura);
		System.out.println("\nO número de mulheres é: "+numeroMulheres);
		System.out.printf("\nA média de altura dos homens é: %.2f",mediaAltura);		
	}
}
