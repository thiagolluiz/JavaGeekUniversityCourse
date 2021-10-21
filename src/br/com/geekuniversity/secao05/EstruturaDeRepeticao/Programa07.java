package br.com.geekuniversity.secao05.EstruturaDeRepeticao;
import java.util.Scanner;
/*
 * Receba dados do usuáio enquanto a idade for maior que 0
 */

// While
public class Programa07 {
	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		// Sempre checa o valor antes de excecutar o bloco
		while (idade > 0) {
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
