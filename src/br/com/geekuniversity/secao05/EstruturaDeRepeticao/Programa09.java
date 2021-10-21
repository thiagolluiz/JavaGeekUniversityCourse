package br.com.geekuniversity.secao05.EstruturaDeRepeticao;

import java.util.Scanner;

// for
public class Programa09 {
	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		// Variável de controle; condição de parada; forma de incremeto
		// i++ -> i = i + 1
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			// Lê o teclado com entrada do tipo String
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//Lê a entrada do teclado do tipo inteiro
			//idade = teclado.nextInt(); // BUG
			idade = Integer.parseInt(teclado.nextLine());//recebe a entrada como uma string "(teclado.nextLine())" e converte em um inteiro "Integer.parseInt()"
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
		}
		
		teclado.close();
	}
	
	
}
