package br.com.lista2.q2.empresa;

	public class Principal {

	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		empregado.setNome("joel");
		empregado.setSalario(123.00f);
		System.out.println(empregado);
		
		Gerente gerente = new Gerente();
		gerente.setDepartamento("administração");
		gerente.setNome("joel");
		gerente.setSalario(123.00f);
		System.out.println(gerente); 
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("joel");
		vendedor.setSalario(100.00f);
		vendedor.setPercentualComissao(10);
		System.out.println(vendedor);
			
		}

}
