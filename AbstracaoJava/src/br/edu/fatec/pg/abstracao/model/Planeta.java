package br.edu.fatec.pg.abstracao.model;

public class Planeta {
 
	public String nome;
	public double tamanho;
	public String estado;
	
	public Planeta(String nome, double tamanho, String estado) {
	    this.nome = nome;
	    this.tamanho = tamanho;
	    this.estado = estado;
	}
	
	public void orbitar () {
		System.out.println("orbitando!");
	}
	
	public void rotacionando () {
		System.out.println("rotacionando!");
	}
	
	public void formar () {
		System.out.println("planeta se formando!");
	}
	
}
