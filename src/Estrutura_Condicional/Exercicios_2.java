package Estrutura_Condicional;

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
		 */
		Scanner sc = new Scanner(System.in);

		String sexo;
		String estadoCivil;
		int anos;
		System.out.print("Qual seu sexo, M ou F?");
		sexo = sc.nextLine();
		System.out.print("Estado civil?");
		estadoCivil = sc.nextLine();
	

		if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("Casada")) {
			System.out.print("casada a quantos anos?");
			anos = sc.nextInt();
			System.out.println(anos);

		} else {
		}

		sc.close();
	}

}
