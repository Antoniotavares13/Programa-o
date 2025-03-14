package br.edu.fatec.pg.abstracao.model;

public class Jaqueta {
	public String marca;
	public double tamanho;
	public String material;
	
	public Jaqueta(String marca, double tamanho, String material) {
	    this.marca = marca;
	    this.tamanho = tamanho;
	    this.material = material;
	}
	
	public void vestir () {
		System.out.println("vestindo!");
	}
	
	public void fechar () {
		System.out.println("fechando!");
	}
	
	public void ajustar () {
		System.out.println("ajustando!");
	}
}
