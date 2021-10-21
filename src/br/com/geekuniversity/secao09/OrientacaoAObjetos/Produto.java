package br.com.geekuniversity.secao09.OrientacaoAObjetos;
// Classes

/*
- O nome das classes se inicia em letra mai�scula;
- O nome n�o deve conter: Acentua��o, caracteres especiais, espa�o;
- Nas classes Java, nao existe a implementa��o da fun��o MAIN()
- O nome da classe Java deve ser o mesmo nome do arquivo Java.
- Tudo que estiver dentro das "chaves"{} faz parte da classe.
- Todas classe Java possui a seguinte forma:

public class NomeDaClasse{

}
 */

//Atributos

/*
- S�o as caracteristicas da classe/molde/modelo de dados
- Podemos entender atributos como vari�veis da classe;
- Uma outra forma de nomenclatura para os atributos s�o estados;
- Atributos s�o nomeados em letras min�sculas, sem espa�os, sem
 caracteres especiais, sem acentu��o.
 */

// M�todo

/*
- Podemos entender os m�todos como a a��o que � realizada por um objeto da classe;
- Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe;
- 
- Mesmos requisitos para fun��es
    Uma fun��o deve ter o seguinte:
	a) Tipo de retorno (Tpo de dado que a fun��o vai retornar);
	b) Nome - Corresponde a a��o que a fun��o realiza;
	c) Par�metros/Argumentos de entrada (Opcional);
	d) Retorno (Opcional - depende do tipo de retorno); 
 */

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	// M�todo para aumentar o pre�o do projeto em 10
	void aumenta_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
