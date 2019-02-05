package br.com.lista1.q3.conta;

public class Conta {
	private int numeroConta;
	private float saldo;
	
	public void saque(int numero, float valor) {
		if(validarConta(numero) == true) {
			if (validarSaque(valor) == true) {
				this.saldo = this.saldo - valor;
			}
		}
		
	}
	
	public void depositar(int numero,float valor) {
		if(validarConta(numero) == true) {
			this.saldo+=valor;
		}
		
	}
	
	private boolean validarSaque(float valor) {
		if(this.saldo >= valor) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean validarConta(int numeroConta) {
		if (this.numeroConta == numeroConta) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return " numero da conta: " + numeroConta + "o seu saldo é: " + saldo;
		
	}
}
