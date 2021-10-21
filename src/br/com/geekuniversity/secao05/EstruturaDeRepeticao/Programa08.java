package br.com.geekuniversity.secao05.EstruturaDeRepeticao;
import java.util.Scanner;
/*
 * Receba dados do usu�io enquanto a idade for maior que 0
 */

// do while
public class Programa08 {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		// Para receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		// Primeiro executa o bloco, depois faz a checagem
		do {
			System.out.println("Informe seu nome: ");
			// L� o teclado com entrada do tipo String
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//L� a entrada do teclado do tipo inteiro
			//idade = teclado.nextInt(); // BUG
			idade = Integer.parseInt(teclado.nextLine());//recebe a entrada como uma string "(teclado.nextLine())" e converte em um inteiro "Integer.parseInt()"
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
		}while (idade > 0); 
		
		teclado.close();
		
		
	}
}
