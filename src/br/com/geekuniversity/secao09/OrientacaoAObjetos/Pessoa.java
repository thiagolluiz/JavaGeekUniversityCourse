package br.com.geekuniversity.secao09.OrientacaoAObjetos;
// Classes

// Atributos

// Métodos

// Construtores

/*
- Sempre um contrutor vazio tem a seguinte forma:

public NomeDaClase( ) { }

 */


public class Pessoa {
	public String nome;
	public String email;
	public int anoNascimento;
	
	// Construtor vazio
	public Pessoa() {}
	
	// Construtor com Parâmetros
	public Pessoa(String nome, String email, int anoNascimento) {
		// this == Este objeto
		this.nome = nome;
		this.email =  email;
		this.anoNascimento = anoNascimento;
	}	
		// Imprimir na tela os nomes
	public void imprimirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano de Nascimento: " + this.anoNascimento + "\n");
	}
}
