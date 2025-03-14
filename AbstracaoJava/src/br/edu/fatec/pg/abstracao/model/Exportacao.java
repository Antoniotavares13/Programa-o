package br.edu.fatec.pg.abstracao.model;

public class Exportacao {
	public String mercadoria;
	public double logistica;
	public double documentacao;
	
	public Exportacao(String mercadoria, double logistica, double documentacao) {
	    this.mercadoria = mercadoria;
	    this.logistica = logistica;
	    this.documentacao = documentacao;
	}
	
	public void transportar () {
		System.out.println("transportando!");
	}
	
	public void comercializar () {
		System.out.println("comercializando!");
	}
	
	public void negociar () {
		System.out.println("negociando!");
	}
}
