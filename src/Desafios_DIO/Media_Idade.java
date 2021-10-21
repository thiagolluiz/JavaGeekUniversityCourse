package Desafios_DIO;
import java.io.IOException;
import java.util.Scanner;

public class Media_Idade {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		float num , media , soma = 0 ;
		int cont = 0 ;

	do {
		System.out.println("Informe o número: ");
		num = teclado.nextInt();
			if (num >= 1) {
				soma = soma + num ;
				cont ++ ;
			}	
	} while ( num >= 1 ) ;
	
			media = soma / cont;
			System.out.printf("A média dos número digitados é: " + "%.2f", media );

		teclado.close();
	}
}