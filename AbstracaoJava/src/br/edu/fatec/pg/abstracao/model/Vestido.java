package br.edu.fatec.pg.abstracao.model;

public class Vestido {
	public String marca;
	public double tamanho;
	public String cor;
	
	public Vestido(String marca, double tamanho, String cor) {
	    this.marca = marca;
	    this.tamanho = tamanho;
	    this.cor = cor;
	}
	
	public void vestir () {
		System.out.println("vestindo!");
	}
	
	public void rasgar () {
		System.out.println("rasgando");
	}
	
	public void combinar () {
		System.out.println("combinando!");
	}
}
