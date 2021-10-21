package br.com.geekuniversity.secao06.TiposDeDados;

//Tipos de dados
//N�meros (Inteiros e Reais)
public class Programa12 {

	public static void main(String[] args) {
		//Tipos Prim�rios / Primitivo
		// Por padr�o, os n�meros reais em Java s�o considerados double
		float preco1 = 23.4f; // 23.40
		double preco2 = 23.4; //23.449848489498

		//Tipos n�o-Prim�rios / N�o-Primitivo
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> pre�o1= " + preco1);
		System.out.println("double -> pre�o2= " + preco2);
		System.out.println("Float -> pre�o3= " + preco3);
		System.out.println("Double -> pre�o4= " + preco4);
		
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
