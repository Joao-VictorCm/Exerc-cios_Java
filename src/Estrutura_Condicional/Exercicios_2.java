package Estrutura_Condicional;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Scanner;

public class Exercicios_2 {

	public static void main(String[] args) {
		/*
		 * 1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma
		 * de A + B é menor que C.
		 */

		int A = 15;
		int B = 25;
		int C = 60;

		int soma = A + B;

		if (soma < C) {
			System.out.println("A soma de " + A + " + " + B + " é menor que " + C);
		} else {
			System.out.println(soma);
		}
		/*
		 * -----------------------------------------------------------------------------
		 * 2) Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa.
		 * Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada
		 * (anos).
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String sexo; String estadoCivil; int anos;
		 * System.out.print("Qual seu sexo, M ou F?"); sexo = sc.nextLine();
		 * System.out.print("Estado civil?"); estadoCivil = sc.nextLine();
		 * 
		 * if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("Casada")) {
		 * System.out.print("casada a quantos anos?"); anos = sc.nextInt();
		 * System.out.println(anos);
		 * 
		 * } else { }
		 * 
		 * sc.close();
		 * 
		 * 
		 * -----------------------------------------------------------------------------
		 * 3) Faça um algoritmo para receber um número qualquer e informar na tela se é
		 * par ou ímpar.
		 */

		double numero = 14;

		if (numero % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
		/*
		 * -----------------------------------------------------------------------------
		 * 4) Faça um algoritmo que leia dois valores inteiros J e K se os valores forem
		 * iguais deverá se somar os dois, caso contrário multiplique J por K. Ao final
		 * de qualquer um dos cálculos deve-se atribuir o resultado para uma variável L
		 * e mostrar seu conteúdo na tela.
		 */

		int J = 5;
		int K = 2;
		int L;

		if (J == K) {
			L = J + K;
			System.out.println("Numeros inguais " + L);
		} else {
			L = J * K;
			System.out.println("numeros diferentes " + L);
		}
		/*
		 * -----------------------------------------------------------------------------
		 * 8) Escreva um algoritmo que leia três valores inteiros e diferentes e
		 * mostre-os em ordem decrescente.
		 */
		
		int a = 1;
		int b = 6;
		int c = 25;
	
		
		

	}

}
