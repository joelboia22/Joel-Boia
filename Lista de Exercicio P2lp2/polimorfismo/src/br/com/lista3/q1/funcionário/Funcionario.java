package br.com.lista3.q1.funcionário;

public class Funcionario {
	private String nome;
	private String cpf;
	private String registroUnico;
	private String email;
	private String dn;
	private String senha;
	private String funcao; 
	
	//método
	public boolean  realizarLogin(String login, String senha) {
		if ((login == this.email || login == this.registroUnico) && senha == this.senha ) {
			return true;
		}else {
			return false;
		}
			
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistroUnico() {
		return registroUnico;
	}

	public void setRegistroUnico(String registroUnico) {
		this.registroUnico = registroUnico;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
}
