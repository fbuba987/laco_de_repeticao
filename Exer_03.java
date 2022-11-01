package exercicio_laco;

import java.util.Scanner;

public class Exer_03 {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
/*
 Escreva um algoritmo em Java, que leia números inteiros via teclado, 
 até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, 
 que sejam positivos. Veja o exemplo abaixo:
 */

		int numero, soma = 0, cont = 0;

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero != 0) {
				if(numero > 0) {
					soma += numero;
					cont++;
				}
			}
		} while (numero != 0);
		System.out.println("Contagem terminada, A soma dos números positivos é " + soma);
		System.out.println(numero);

	}

}
