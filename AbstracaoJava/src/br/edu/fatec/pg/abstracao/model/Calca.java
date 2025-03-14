package br.edu.fatec.pg.abstracao.model;

public class Calca {
	public String marca;
	public double tamanho;
	public String material;
	
	public Calca(String marca, double tamanho, String material) {
	    this.marca = marca;
	    this.tamanho = tamanho;
	    this.material = material;
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
