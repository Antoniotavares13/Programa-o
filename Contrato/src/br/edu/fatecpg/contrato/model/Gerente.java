package br.edu.fatecpg.contrato.model;


public class Gerente implements Funcionario {
	
	
	public void fecharCaixa () {
		
		System.out.println ("Fechamento Realizado!");
		
	}

	@Override
	public void baterPonto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarMaterial() {
		System.out.println ("Mateiral Solicitado!");
		
	}

}
