package br.edu.fatec.pg.abstracao.model;

public class Onibus {
	public String empresa;
	public double tamanho;
	public String localizacao;
	
	public Onibus(String empresa, double tamanho, String localizacao) {
	    this.empresa = empresa;
	    this.tamanho = tamanho;
	    this.localizacao = localizacao;
	}
	
	public void andar () {
		System.out.println("onibus ligado!");
	}
	
	public void acelerar () {
		System.out.println("acelerando!");
	}
	
	public void parar () {
		System.out.println("onibus parando!");
	}
}
