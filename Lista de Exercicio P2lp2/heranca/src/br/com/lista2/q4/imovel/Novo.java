package br.com.lista2.q4.imovel;

public class Novo extends Imovel {
	
	private float adicionalPreco;
	
	public float getAdicionalPreco() {
		return adicionalPreco;
	}
	
	public void setAdicionalPreco(float adicionalPreco) {
		this.adicionalPreco = adicionalPreco;
	}
	
	public double getValorTotal() {
		return getPreco() + adicionalPreco;
	}
}
