package br.edu.fatec.pg.abstracao.model;

public class Cometa {
 
	public String nome;
	public double tamanho;
	public String localizacao;
	
	public Cometa(String nome, double tamanho, String localizacao) {
	    this.nome = nome;
	    this.tamanho = tamanho;
	    this.localizacao = localizacao;
	}
	
	public void colidir () {
		System.out.println("colidindo!");
	}
	
	public void destruir () {
		System.out.println("destruindo!");
	}
	
	public void desviar () {
		System.out.println("orbita desviada!");
	}
	
}
