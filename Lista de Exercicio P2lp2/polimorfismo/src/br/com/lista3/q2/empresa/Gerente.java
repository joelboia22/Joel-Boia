package br.com.lista3.q2.empresa;

public class Gerente extends Funcionario{

    public Gerente(String nome,String email, String registro, String senha) {
        super(nome, email, registro, senha);
    }
    
    
    
    
    public void RealizarLoginEmail(String email, String senha) {
        
        if (email.equals(getEmail()) && senha.equals(getSenha())) {
            System.out.println(getNome() + " é Gerente!");
        }else{
            System.out.println("Erro!");
        }
        
    }

    
    public void RealizarLoginRegistro(String registro, String senha) {
                
        if (registro.equals(getRegistro()) && senha.equals(getSenha())) {
            System.out.println(getNome() + " é Gerente!");
        }else{
            System.out.println("Erro!");
        }
    }
    
}