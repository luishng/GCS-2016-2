package calc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		final int SOMA = 1;
		final int SUBTRACAO = 2;
		final int MULTIPLICACAO = 3;
		final int DIVISAO = 4;
		final int SAIR = 5;
		
		do{
			System.out.println("Calculadora Bugada:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			opcao = scanner.nextInt();
			
			switch(opcao){
				case SOMA:
					break;
				case SUBTRACAO:
					break;
				case MULTIPLICACAO:
					break;
				case DIVISAO:
					break;
				case SAIR:
					System.out.println("SAIU!");
					break;
				default:
					System.out.println("Opcao invalida!");
					break;
				
			}
		}while(opcao != 5);
	}
}
