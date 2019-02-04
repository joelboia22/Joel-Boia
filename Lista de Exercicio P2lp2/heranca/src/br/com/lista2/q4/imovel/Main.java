package br.com.lista2.q4.imovel;

public class Main {

	public static void main(String[] args) {
	
		Novo n = new Novo();
		n.setPreco(450);
		n.setAdicionalPreco(128);
		n.getValorTotal();
		System.out.println(n.getValorTotal());
		
		Velho v = new Velho();
		v.setPreco(560);
		v.setDescontoPreco(145);
		v.getValorTotal();
		System.out.println(v.getValorTotal());
	
	}

}
