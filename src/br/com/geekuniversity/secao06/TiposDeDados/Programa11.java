package br.com.geekuniversity.secao06.TiposDeDados;

// Tipos de dados
// N�meros (Inteiros e Reais)
public class Programa11 {

	public static void main(String[] args) {
		
		//Tipos Prim�rios / Primitivo
		long num0 = 9; // Inteiro  64 bits - MAX 9223372036854775807
		int num1 = 4; //Inteiro 32 bits - MAX 2147483647
		short num2 = 4; //Inteiro (curto/menor/baixo) 16 bits - MAX 32767
		byte num3 = 4; // Inteiro 8 bits - MAX 127
		char num8 = 176; // Caractere 16 bits - MAX 65535
		
		//Tipos n�o-Prim�rios / N�o-Primitivo
		Long num7 = 999l;
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Character num9 = 228;
		
		System.out.println("long    -> Num0 = " + num0);
		System.out.println("int     -> Num1 = " + num1);
		System.out.println("short   -> Num2 = " + num2);
		System.out.println("byte    -> Num3 = " + num3);
		System.out.println("Long    -> Num7 = " + num7);
		System.out.println("char    -> Num8 = " + num8);
		System.out.println("Integer -> Num4 = " + num4);
		System.out.println("Short   -> Num5 = " + num5);
		System.out.println("Byte    -> Num6 = " + num6);
		System.out.println("Character-> Num9 = " + num9);
		
		System.out.println();
		
		System.out.println("long/Long::     " + Long.SIZE + " bits");
		System.out.println("int/Integer:    " + Integer.SIZE + " bits");
		System.out.println("short/Short:    " + Short.SIZE + " bits");
		System.out.println("byte/Byte:      "+ Byte.SIZE + " bits");
		System.out.println("char/Character: "+ Character.SIZE + " bits");
		
		System.out.println();
		
		System.out.println("Valor Min long/Long:      " + Long.MIN_VALUE);
		System.out.println("Valor Max long/Long:      " + Long.MAX_VALUE);
		
		System.out.println("Valor Min int/Integer:    " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/Integer:    " + Integer.MAX_VALUE);
		
		System.out.println("Valor Min short/Short:    " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Short:    " + Short.MAX_VALUE);
		
		System.out.println("Valor Min byte/Byte:      " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte:      " + Byte.MAX_VALUE);

		System.out.println("Valor Min char/Character: " + Character.MIN_VALUE);  //0
		System.out.println("Valor Max char/Character: " + Character.MAX_VALUE); //65535
			
	}

}
