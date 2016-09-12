package calc;

import java.util.Scanner;
import calc.Calculadora;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		int opcao = 0;
		double numero1 = 0.0;
		double numero2 = 0.0;
		double resultado = 0.0;
		
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
			System.out.println("Primeiro numero:");
			numero1 = scanner.nextDouble();
			System.out.println("Segundo numero:");
			numero2 = scanner.nextDouble();
			
			
			switch(opcao){
				case SOMA:
					System.out.println("Voce esta na Soma");
					break;
				case SUBTRACAO:
					System.out.println("Voce esta na Subtracao");
					break;
				case MULTIPLICACAO:
					System.out.println("Voce esta na Multiplicacao");
					break;
				case DIVISAO:
					System.out.println("Voce esta na Divisao");
					resultado = calc.divide(numero1, numero2);
					break;
				case SAIR:
					System.out.println("SAIU!");
					break;
				default:
					System.out.println("Opcao invalida!");
					break;
				
			}
			System.out.println("O resultado é: " +resultado);
		}while(opcao != 5);
	}
}
