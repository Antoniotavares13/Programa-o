package br.edu.fatec.pg.abstracao.model;

public class Tenis {
	public String marca;
	public double tamanho;
	public String modelo;
	
	public Tenis(String marca, double tamanho, String modelo) {
	    this.marca = marca;
	    this.tamanho = tamanho;
	    this.modelo = modelo;
	}
	
	public void calcar () {
		System.out.println("calçando!");
	}
	
	public void amarrar () {
		System.out.println("amarrando!");
	}
	
	public void desamarrar () {
		System.out.println("desamarrando!");
	}
}
