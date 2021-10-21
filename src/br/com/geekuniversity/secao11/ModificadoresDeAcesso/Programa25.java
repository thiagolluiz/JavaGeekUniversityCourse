package br.com.geekuniversity.secao11.ModificadoresDeAcesso;
// Encapsulamento
// Capsula
//
public class Programa25 {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente ("João da Silva","Rua da Paz, 45");
		Cliente maria = new Cliente ("Maria da Silva","Rua da Paz, 45");
		
		Conta conta_joao = new Conta(1, 100.f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.f, 500.0f, maria);
		
		System.out.println("Saldo do João (Antes do Saque): "+ conta_joao.getSaldo());
		System.out.println("Saldo do Maria: "+ conta_maria.getSaldo());
		
		conta_joao.sacar(180);
		System.out.println("Saldo do João (Depois do Saque): "+ conta_joao.getSaldo());
		
	}

}
