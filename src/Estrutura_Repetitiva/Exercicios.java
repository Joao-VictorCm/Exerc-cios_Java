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
		 * do { 
		 * System.out.print("Digite dois numeros:"); X = sc.nextInt(); Y = sc.nextInt();
		 * if (X != Y) { resp = (X < Y) ? "CRESCENTE" : "DECRESCENTE";
		 * System.out.println(resp);
		 * }
		 * } while (X != Y);
		 * -------------------------------------------------------------------------
		 */

		/*
		 * Problema "media_idades"
		 */
		
		int idades = sc.nextInt();
		int soma = 0;
		int qtd = 0;
		while(idades > 0) {
			idades = sc.nextInt();
			qtd++;
			
		}
		soma = idades + idades / qtd;
		System.out.println(soma);

		sc.close();
	}

}
