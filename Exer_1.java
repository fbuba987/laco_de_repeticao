package exercicio_laco;

import java.util.Scanner;

public class Exer_1 {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 Escreva um algoritmo em Java, que leia 10 números inteiros via teclado 
		 e mostre na tela quantos números são pares e quantos número são ímpares. 
		 Veja o exemplo abaixo:
		 */
		
		int numero, pares = 0, impares = 0;
		
		for(int i =1; i <=10; i++) {
			System.out.println("Digita numeros de 1 a 10: " + i + ": ");
			numero = leia.nextInt();
			if (numero % 2 ==0) 
				pares++;
			if (numero % 2 != 0)
				impares++;
		}
		
		System.out.println("Os numeros pares são:  " + pares);
		 
		System.out.println("Os numeros ímpares são:  " + impares);

	}

}
