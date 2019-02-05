package br.com.lista1.q3.conta;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumeroConta(100100);
		conta.depositar(100100, 1500.00f);
		conta.saque(100100, 350.00f);
		System.out.println(conta);

	}

}
