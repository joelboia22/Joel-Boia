package br.com.lista2.q1.ingresso;

public class Ingresso {

	protected float valor;
	
	public Ingresso(float valor) {
		this.valor = 2.00f;
	}

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "O valor do ingresso é: " + getValor();
	}

}
