package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		double valorProduto=0, desconto,juros;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor do Produto a ser pago: ");
		valorProduto = leia.nextDouble();
		
		System.out.println("\t Bem vinde ao Menu de Códigos de Pagamento");
		System.out.println("\n1- À vista em dinheiro ou cheque");
		System.out.println("\n2- À vista no cartão de crédito");
		System.out.println("\n3- Em duas vezes, preço normal de etiqueta sem juros");
		System.out.println("\n4- Em duas vezes, preço normal de etiqueta mais juros de 10%");
		
		System.out.println("\nDigite o Código da Condição de pagamento: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			desconto = 0.1 * valorProduto;
			valorProduto = valorProduto - desconto;
			System.out.println("O valor final do produto a ser pago é: R$"+valorProduto);
		break;
		case 2:
			desconto = 0.15 * valorProduto;
			valorProduto = valorProduto - desconto;
			System.out.println("O valor final do produto a ser pago é: R$"+valorProduto);
		break;
		case 3:
			valorProduto = valorProduto/2;
			System.out.println("O valor final do produto a ser pago são duas parcelas de: R$"+valorProduto);
		break;
		case 4:
			juros = valorProduto * 0.1;
			valorProduto = (valorProduto / 2) + juros;
			System.out.println("O valor final do produto a ser pago são duas parcelas de: R$"+valorProduto);
		break;
		}		

	}

}
