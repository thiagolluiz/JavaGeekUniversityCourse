package br.com.geekuniversity.secao06.TiposDeDados;

// Tipos Booleanos
public class Programa14 {
	public static void main(String[] args) {
		// Tipos Primitivos
		boolean verdadeiro = true;
		boolean falso = false;

		// Tipos N�o Primitivos
		Boolean v = true;
		Boolean f = false;
		
		boolean ativo = true;

		System.out.println("Veradeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);

		if (verdadeiro == true) {
			System.out.println("� verdadeiro!");
		} else {
			System.out.println("� Falso!");
		}
		if (!(1 == 3)) {
			System.out.println("1 = 1 � verdadeiro");
		} else {
			System.out.println("... � Falso!");
		}		
		if(ativo) {
			System.out.println("Pode acessar o sistema.");
		}else {
			System.out.println("Acesso negado.");
		}
	}
}
/*
 * if (realiza uma verifica��o que no final retorna true ou false)
 */