package br.com.lista2.q4.imovel;

public class Velho extends Imovel {
	
	private float descontoPreco;
	
	public float getDescontoPreco() {
		return descontoPreco;
	}
	
	public void setDescontoPreco(float descontoPreco) {
		this.descontoPreco = descontoPreco;
	}
	
	public double getValorTotal() {
		return getPreco() - descontoPreco;
	}
}
