package br.com.geekuniversity.secao04.EstruturaDeDecisao;

// Instru��o Switch
public class Programa06 {

	public static void main(String[] args) {
		int numero = 15;
		
		switch (numero) {
			case 0:
				System.out.println("O n�mero � 0");
				break;
			case 3:
				System.out.println("O n�mero � 3");
				break;
			case 5:
				System.out.println("O n�mero � 5");
				break;
			default:
				System.out.println("[Default] O n�mero � " + numero);
				break;
			}
	}
}
