package br.com.lista1.q5.conceitos;

public class Basinha extends Base{
	public int c;
	
	public void fazerMetodo() {
		a = b+c;
	}

	//não rodará, o campo b não ficará visivel a outro classe pq não foi criados os metodos get e set dele
}
