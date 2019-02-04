package br.com.lista2.q2.empresa;

	public class Gerente extends Empregado{
	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento; 
	}
	
	public String toString() {
		return "O " + getNome() +  " recebe " + salario + " e trabalha no " + departamento;
	}

}
