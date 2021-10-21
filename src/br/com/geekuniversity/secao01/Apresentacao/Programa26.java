package br.com.geekuniversity.secao01.Apresentacao;
// Public

/*
 Puclico - Pode ser utilizado em todo o projeto;
 */
import br.com.geekuniversity.secao11.ModificadoresDeAcesso.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente ("Angelina Lolie","Rua da Barra, 26");
				
		//System.out.println("Nome: "+ cli.nome); //Private
		//System.out.println("Endereço: "+ cli.endereco); //Private

	}

}
