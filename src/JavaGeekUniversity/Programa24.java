package JavaGeekUniversity;

import br.com.geekuniversity.secao09.OrientacaoAObjetos.Pessoa;

// Contrutor

/*
- O contrutor de uma classe SEMPRE tem o nome da classe;
- Por padrão, a JVM - Java Virtual Machine, cria em tempo de excução,
um construtor padrão -  um contrutor vazio;
- Podemos ter mais de um construtor na classe;
 */
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (Método) Construtor

		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.anoNascimento = 1986;

		pessoa1.imprimirInformacoes();

		
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "jolie@gmail.com", 1976);
		pessoa2.imprimirInformacoes();
		
		 Pessoa pessoa3 = new Pessoa("Carla Maria", "cmaria@gmail.com", 1957); 
		 pessoa3.imprimirInformacoes();
		 
		 Pessoa pessoa4 = new Pessoa("Geovanna Ewbak", "giewbak@gmail.com", 1985);
		pessoa4.imprimirInformacoes();
		 
	}

}
