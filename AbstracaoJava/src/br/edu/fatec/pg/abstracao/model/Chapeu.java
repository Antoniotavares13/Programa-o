package br.edu.fatec.pg.abstracao.model;

public class Chapeu {
	public String marca;
	public double tamanho;
	public String material;
	
	public Chapeu(String marca, double tamanho, String material) {
	  this.marca = marca;
	  this.tamanho = tamanho;
	  this.material = material;
	}
	
	public void usar () {
		System.out.println("usando!");
	}
	
	public void ajustar () {
		System.out.println("ajustando!");
	}
	
	public void decorar () {
		System.out.println("decorando!");
	}
}
