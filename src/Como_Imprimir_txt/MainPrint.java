package Como_Imprimir_txt;

public class MainPrint {
	public static void main(String[] args) {
		String arq = "teste.txt";
		//---

		int idade1 = 90;
		int idade2 = 80;
		int media = (idade1 + idade2)/2;
		
		String texto = Integer.toString(media) ;//Convertendo int para String
				//"Texto a ser impresso\n"
				//+"Com quebra de linha";
		if (Arquivo_Print.Write(arq,texto))
			System.out.println("Arquivo salvo com sucesso!");
		else
			System.out.println("Erro ao salvar arquivo!");
	}
}
