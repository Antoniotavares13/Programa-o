package br.edu.fatec.pg.abstracao.model;

public class Saia {
	public String marca;
	public double tamanho;
	public String cor;
	
	public Saia(String marca, double tamanho, String cor) {
	    this.marca = marca;
	    this.tamanho = tamanho;
	    this.cor = cor;
	}
	
	public void vestir () {
		System.out.println("vestindo!");
	}
	
	public void ajustar () {
		System.out.println("ajustando!");
	}
	
	public void combinar () {
		System.out.println("combinando!");
	}
}
