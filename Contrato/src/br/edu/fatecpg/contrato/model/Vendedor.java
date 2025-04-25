package br.edu.fatecpg.contrato.model;

public class Vendedor implements Funcionario {

	
	public void realizarVendas () {
		
		System.out.println ("venda Realizada!");
		
	}

	@Override
	public void solicitarMaterial() {
		
		System.out.println ("Material Solicitado!");
	
	}

	@Override
	public void baterPonto() {
		
		System.out.println ("Ponto Registrado!");
		
	}

}
