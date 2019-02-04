package br.com.lista2.q2.empresa;

	public class Vendedor extends Empregado {
	private float percentualComissao;

	
	public float getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public float calcularSalario() {
		return this.salario + ((percentualComissao/100) * salario);  
	}
	
	public String toString() {
		return  "O " + getNome() +  " recebe " + salario + " sem comissão" + " e com comissão " + calcularSalario();
	
	}

}
