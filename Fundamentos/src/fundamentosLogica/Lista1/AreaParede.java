package fundamentosLogica.Lista1;

import java.util.Scanner;

public class AreaParede {

	public static void main(String[] args) {
		/*Respectivamente, altura da parede, largura da parede,
		  altura do azulejo e largura do azulejo */
		float hp, lp, ha, la, totalAzulejos, areaParede, areaAzulejo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a altura da parede: ");
		hp = sc.nextFloat();
		System.out.println("Insira a largura da parede: ");
		lp = sc.nextFloat();
		System.out.println("Insira a altura do azulejo: ");
		ha = sc.nextFloat();
		System.out.println("Insira a largura do azulejo: ");
		la = sc.nextFloat();
		
		/*Cálculo da Área da Parede*/
		areaParede = hp * lp;
		
		/*Cálculo da Área do Azulejo*/
		areaAzulejo = ha * la;
		
		/*Quantos azulejos cabem na parede?*/
		System.out.printf("A quantidade de azulejos que cabem na parede é %.2f", areaParede / areaAzulejo);
		
	}

}
