package br.edu.fatec.pg.abstracao.model;

public class Estrela {

	public String nome;
	public double tamanho;
	public double temperatura;
	
	public Estrela(String nome, double tamanho, double temperatura) {
	    this.nome = nome;
	    this.tamanho = tamanho;
	    this.temperatura = temperatura;
	}
	
	public void nascer () {
		System.out.println("estrela nascendo!");
	}
	
	public void queimar () {
		System.out.println("queimando!");
	}
	
	public void brilhar () {
		System.out.println("estrela brilhando!");
	}
	
}
