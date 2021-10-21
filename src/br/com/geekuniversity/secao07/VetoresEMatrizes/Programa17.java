package br.com.geekuniversity.secao07.VetoresEMatrizes;

public class Programa17 {
	public static void main(String[] args) {
		// Declaração de Defininição de tamanho do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for (int i = 1; i < numeros.length; i++) {
//			numeros[0] = i + 3;
			numeros[i] = i + 3;
//			numeros[9] = i + 3;
		}
		
		System.out.println(numeros[0]);// Primeiro elemento
		System.out.println(numeros[9]);// Último elemento
	
//		 0..9
//		numeros[10] = 42;
//		System.out.println(numeros[10]);
//		 Os vetores/array possuem tamanho fixo e 
//		 não podem ser aumentados/diminuidos
		
		numeros[0] = 7;
		System.out.println(numeros[0]); // Primeiro elemento
		
//		numeros[0] = (int) 23.4f; // cast
		/*
		* Os vetores/array possuem tipos de dados fixos
		* e não aceitam tipos variados.	
		*/	
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 100);
		}
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		System.out.println("");

		
		// 0..1 double
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		System.out.println(Math.round(Math.random() * 10));
		
		System.out.println("");

		for (int i : numeros) {
			System.out.println(i);
		}
		
	}
}
