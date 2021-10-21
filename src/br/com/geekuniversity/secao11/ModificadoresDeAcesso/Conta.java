package br.com.geekuniversity.secao11.ModificadoresDeAcesso;
/*
 * 
 Getters e Setters
 
Getter
    - � um m�todo publico, que serve para consultar dados;
    - A nomenclatura desse m�todos e get_nome_do_atributo()
*/
public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	public Conta (int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	

	public void sacar (float valor) {
		if (valor <= (this.saldo + this.limite)) {
			this.saldo = (this.saldo + this.limite) - valor;
		
		}else {
			System.out.println ("Saldo Insuficiente");
		}
		
	}
	public void depositar (float valor) {
		this.saldo = this.saldo + valor ;
	}
	
	// M�todo getter do atributo Saldo
	public float getSaldo () {
		return this.saldo ;
	}
	
}
