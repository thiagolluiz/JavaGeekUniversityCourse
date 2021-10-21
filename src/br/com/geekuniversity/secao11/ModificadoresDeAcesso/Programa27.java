package br.com.geekuniversity.secao11.ModificadoresDeAcesso;

// Private

/*
 Privado à própria classe. 
 
 Ou seja, só temos acesso ao atributo ou método privado
 dentro da própria classe onde ele foi declarado.
*/
public class Programa27 {

/*	public static void main(String[] args) {
		 Cliente cli1 = new Cliente("Felicity Jones","Rua qualquer 123");
		 
		 System.out.println("Nome: " + cli1.getNome());
		 System.out.println("Endereço: " + cli1.getEndereco());
		 cli1.dizer_oi();
		 
		 Cliente cli2 = new Cliente("Angelina Jolie","Rua Outra 345");
		 
		 System.out.println("Nome: " + cli2.getNome());
		 System.out.println("Endereço: " + cli2.getEndereco());
		 cli2.dizer_oi();
		 
	}

}
*/


static{System.out.println("O Bloco stático foi invocado!");} 



public static void main(String args[]){ 

System.out.println("Olá main"); 

 } 

} 