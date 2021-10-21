package Como_Imprimir_txt;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo_Print {
	public static String Read(String Caminho) {
		String conteudo = "";
		try {
			FileReader arq = new FileReader(Caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			try {
				linha = lerArq.readLine();
				while(linha!= null) {
					conteudo += linha;
					linha = lerArq.readLine();
				}
				arq.close();
				return conteudo;
			} catch (IOException e) {
				System.out.println("Erro: n�o foi poss�vel ler o arquivo!");
				return "";
			}	
		} catch (FileNotFoundException ex) {
			System.out.println("Erro: arquivo n�o encontrado!");
			return "";
		}	
	}
	
	public static boolean Write(String Caminho, String Texto) {
		try {
			FileWriter arq = new FileWriter(Caminho);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(Texto);
			gravarArq.close();
			return true;
		}catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
}
