package br.edu.fatecpg.contrato.model.view;
import br.edu.fatecpg.contrato.model.*;

public class Main {

	public static void main(String[] args) {
	
		Faxineiro faxineiro = new Faxineiro ();
		Gerente gerente = new Gerente ();
		Vendedor vendedor = new Vendedor ();
		
	
		faxineiro.baterPonto ();
		gerente.fecharCaixa();
		vendedor.realizarVendas();
		
	}

}
