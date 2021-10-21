package br.com.geekuniversity.secao06.TiposDeDados;

//Tipos de dados
//Números (Inteiros e Reais)
public class Programa12 {

	public static void main(String[] args) {
		//Tipos Primários / Primitivo
		// Por padrão, os números reais em Java são considerados double
		float preco1 = 23.4f; // 23.40
		double preco2 = 23.4; //23.449848489498

		//Tipos não-Primários / Não-Primitivo
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> preço1= " + preco1);
		System.out.println("double -> preço2= " + preco2);
		System.out.println("Float -> preço3= " + preco3);
		System.out.println("Double -> preço4= " + preco4);
		
		System.out.println();
		
		System.out.println("float/Float: " + Float.SIZE + " bits");
		System.out.println("double/Double: " + Double.SIZE + " bits");

		
		System.out.println();
		
		System.out.println("Valor Min float/Float:: " + Float.MIN_VALUE);
		System.out.println("Valor Max float/Float:: " + Float.MAX_VALUE);
		
		System.out.println("Valor Min double/Double: " + Double.MIN_VALUE);
		System.out.println("Valor Max double/Double: " + Double.MAX_VALUE);
		
	}	
}
