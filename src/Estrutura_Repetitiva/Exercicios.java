package Estrutura_Repetitiva;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		/*
		 * PARTE 1: estrutura while (enquanto) 1: Problema "crescente"
		 */

		Scanner sc = new Scanner(System.in);
		/*
		 * int X; int Y; String resp;
		 * 
		 * do { System.out.print("Digite dois numeros:"); X = sc.nextInt(); Y =
		 * sc.nextInt(); if (X != Y) { resp = (X < Y) ? "CRESCENTE" : "DECRESCENTE";
		 * System.out.println(resp); } } while (X != Y);
		 * -------------------------------------------------------------------------
		 */

		/*
		 * Problema "media_idades"
		 * 
		 * int idade, npessoas; double soma, media;
		 * 
		 * System.out.println("Digite as idades:"); idade = sc.nextInt();
		 * 
		 * if (idade < 0) { System.out.println("IMPOSSIVEL CALCULAR"); } else { soma =
		 * 0; npessoas = 0; while (idade >= 0) { soma = soma + idade; npessoas++; idade
		 * = sc.nextInt(); }
		 * 
		 * media = soma / npessoas;
		 * 
		 * System.out.printf("MEDIA = %.2f\n", media); }
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Problema "senha_fixa
		 * 
		 * System.out.println("Digite sua senha:"); int senha = sc.nextInt();
		 * 
		 * while (senha != 2312) { System.out.println("Senha invalida! Tente novamente:"
		 * + senha); senha = sc.nextInt();
		 * 
		 * } System.out.println("Acesso permitido!");
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Problema "quadrante"
		 * 
		 * Q1 → X > 0 e Y > 0
		 * Q2 → X < 0 e Y > 0
		 * Q3 → X < 0 e Y < 0
		 * Q4 → X > 0 e Y < 0
		 */

		int X = 2;
		int Y = 2;

		while (X) {
			if(X > 0 && Y > 0) {
				System.out.println("Q1");
			}else if(X < 0 && Y > 0) {
				System.out.println("Q2");
			}else if()
		}

		sc.close();
	}

}
