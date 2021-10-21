package br.com.geekuniversity.secao08.Funcoes;

import java.util.Scanner;

// Criando nossas pr�prias fun��es
/*
 Fa�a um programa, que receba diversos nomes 
 de frutas do usu�rio e no final imprima essas 
 frutas em ordem contr�ria. O programa deve
 solicitar ao usu�rio quantas ele quer informar
 
 Informe quantas frutas deseja cadastrar:
 2
 
 Informe o nome de uma fruta:
 Manga
 
 Informe o nome de uma fruta:
 Goiaba
 
 Goiaba
 Manga
 
 */

public class Programa20 {
	// Vari�veis Globais
	// Declara��o de Vetor
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Vari�vel Local
		int qtd ;

		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine()); 
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
		
		teclado.close();

	}
	
/*
	Uma fun��o deve ter o seguinte:
	a) Tipo de retorno (Tpo de dado que a fun��o vai retornar);
	b) Nome - Corresponde a a��o que a fun��o realiza;
	c) Par�metros/Argumentos de entrada (Opcional);
	d) Retorno (Opcional - depende do tipo de retorno); 
*/
	//VOID = vazio, n�o espera retornar nada
	static void  cadastrar_dados(int quantidade) {
		// Definindo o tamanho do vetor
		frutas = new String[quantidade];
		
		for(int i = 0 ; i < quantidade ; i++) { // i++ -> i = i + 1
			System.out.println("Informe a " + (i + 1) +" fruta: ");
			frutas[i]= teclado.nextLine();

		}		
	}
	
	static void mostrar_dados( int quantidade) {
		for(int i = (quantidade - 1) ; i >= 0 ; i--) { // i-- -> i = i - 1
			System.out.println("Fruta: "+ frutas[i]);
		}
	}
}
 




