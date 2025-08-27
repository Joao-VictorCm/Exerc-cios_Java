package exercicos_Java;

import java.util.Scanner;

public class Estruturas_Sequencias {

	public static void main(String[] args) {
		/*
		 * 1. O coração humano bate em média uma vez por segundo. Desenvolver um
		 * algoritmo para calcular e escrever quantas vezes o coração de uma pessoa
		 * baterá se viver X anos. Dados de entrada: idade da pessoa (inteiro em anos).
		 * Considerações: 1 anos = 365,25 dias, 1 dia = 24 horas, 1 hora = 60 minutos e
		 * 1 minuto = 60 segundos. Exemplo Entrada 42 Saída O CORACAO BATEU 1.3254192E9
		 * VEZES
		 * 
		 * double hora = 1.0; double dia = 24.0; double ano = 365.25;
		 * 
		 * double x = hora * (60.0 * 60); double y = dia * x; double z = ano * y;
		 * 
		 * Scanner sc = new Scanner(System.in); int anoDigitado; anoDigitado =
		 * sc.nextInt();
		 * 
		 * double resultado = z * 42;
		 * 
		 * System.out.println("Seu coração bateu " + resultado + " vezes durante " +
		 * anoDigitado + " anos");
		 * 
		 * sc.close();
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * 2. Um fabricante de latas deseja desenvolver um algoritmo para calcular o
		 * custo de uma lata cilíndrica de alumínio, sabendo­se que o custo do alumínio
		 * por m² é R$ 100,00. Dados de entrada: raio e altura da lata (em metros).
		 * Arealata=Areabase π *r2∗2 +Arealado  2 * *r*h π  considere o preço do
		 * alumínio por m² como sendo uma constante.
		 */
		Scanner sc = new Scanner(System.in);
		int raio;
		int altura;
		System.out.println("Raio:");
		raio = sc.nextInt();
		System.out.println("Altura");
		altura = sc.nextInt();

		double raioElevadoaoQuadrado = Math.pow(raio, 2.0);
		double areaBase = Math.PI * raioElevadoaoQuadrado * 2.0;
		double areaLateral = 2.0 * Math.PI * 6.0 * altura;

		double result = (areaBase + areaLateral) * 100;

		System.out.println("Valor do custo é " + result);

		sc.close();
		
		
		
		/*
		 * -----------------------------------------------------------------------------
		 * 
		 * 3. Teorema de Pitágoras: H² = L1² + L2² . Tem uma infinidade de números com
		 * essa combinação. Dado dois números inteiros positivos, M e N, onde M>N,
		 * desenvolver um algoritmo para entrar com dois números positivos e fornecer os
		 * valores dos lados e da Hipotenusa do triângulo gerados combinando M e N.
		 * L1=M2−N 2 ,L 2=2 *M*N, Hipotenusa = M² + N²
		 */

	}

}
