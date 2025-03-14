package br.edu.fatec.pg.abstracao.model;

public class Bota {
	public String marca;
	public double tamanho;
	public String material;
	
	public Bota(String marca, double tamanho, String material) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.material = material;
    }
	
	public void calçar () {
		System.out.println("calçando!");
	}
	
	public void amarrar () {
		System.out.println("amarrando!");
	}
	
	public void confortar () {
		System.out.println("confortando!");
	}
}
