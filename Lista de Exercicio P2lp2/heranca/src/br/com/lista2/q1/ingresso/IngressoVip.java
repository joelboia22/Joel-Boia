package br.com.lista2.q1.ingresso;

public class IngressoVip extends Ingresso {
	
	private float valorAdicional = (float) 3.00;
	
	public IngressoVip(float valor) {
		super(valor);
	}
	
	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public float getValor() {
		return this.valor = valor + valorAdicional;
	}
	
	public String toString() {
		return "O valor do ingresso VIP é: " + getValor();
	}

}
