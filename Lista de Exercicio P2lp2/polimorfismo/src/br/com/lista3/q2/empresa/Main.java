package br.com.lista3.q2.empresa;

public class Main {
	
		public static void main(String[] args) {
			
			Funcionario g = new Gerente("Joel","joel23@email.com", "232425", "232425");
	        
	        g.RealizarLoginEmail("joel23@email.com", "232425");
	        g.RealizarLoginRegistro("232425", "232425");
	        
	        g.RealizarLoginEmail("000", "123");
	        
	        Funcionario a = new Atendente("wall", "wall321@gmail.com", "459", "459");
	        
	        a.RealizarLoginEmail("321@gmail.com", "459");
	        a.RealizarLoginRegistro("459", "459");
	        
	        a.RealizarLoginEmail("123", "456");
		}
			
}
        
        
		
