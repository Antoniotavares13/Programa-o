package br.edu.fatec.pg.abstracao.model;

public class Serpente {

	public String nome;
	public double tamanho;
	public boolean peconhenta;
	
	public Serpente(String nome, double tamanho, boolean peconhenta) {
	    this.nome = nome;
	    this.tamanho = tamanho;
	    this.peconhenta = peconhenta;
	}
	
	public void rastejar () {
		System.out.println("rastejando!");
	}
	
	public void alimentar () {
		System.out.println("alimentando!");
	}
	
	public void morder () {
		System.out.println("mordeu!");
	}
	
}
