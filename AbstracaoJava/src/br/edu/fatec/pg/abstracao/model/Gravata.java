package br.edu.fatec.pg.abstracao.model;

public class Gravata {
	public String marca;
	public double tamanho;
	public String cor;
	
	public Gravata(String marca, double tamanho, String cor) {
	    this.marca = marca;
	    this.tamanho = tamanho;
	    this.cor = cor;
	}
	
	public void amarrar () {
		System.out.println("amarrando!");
	}
	
	public void ajustar () {
		System.out.println("ajustando!");
	}
	
	public void colocar () {
		System.out.println("colocando!");
	}
}
