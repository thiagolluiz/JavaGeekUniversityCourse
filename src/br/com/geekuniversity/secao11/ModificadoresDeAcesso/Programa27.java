package br.com.geekuniversity.secao11.ModificadoresDeAcesso;

// Private

/*
 Privado � pr�pria classe. 
 
 Ou seja, s� temos acesso ao atributo ou m�todo privado
 dentro da pr�pria classe onde ele foi declarado.
*/
public class Programa27 {

/*	public static void main(String[] args) {
		 Cliente cli1 = new Cliente("Felicity Jones","Rua qualquer 123");
		 
		 System.out.println("Nome: " + cli1.getNome());
		 System.out.println("Endere�o: " + cli1.getEndereco());
		 cli1.dizer_oi();
		 
		 Cliente cli2 = new Cliente("Angelina Jolie","Rua Outra 345");
		 
		 System.out.println("Nome: " + cli2.getNome());
		 System.out.println("Endere�o: " + cli2.getEndereco());
		 cli2.dizer_oi();
		 
	}

}
*/


static{System.out.println("O Bloco st�tico foi invocado!");} 



public static void main(String args[]){ 

System.out.println("Ol� main"); 

 } 

} 