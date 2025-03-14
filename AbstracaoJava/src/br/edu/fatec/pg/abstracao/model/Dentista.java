package br.edu.fatec.pg.abstracao.model;

public class Dentista {
	public String nome;
	public double cro;
	public String localizacao;
	
	public Dentista(String nome, double cro, String localizacao) {
	    this.nome = nome;
	    this.cro = cro;
	    this.localizacao = localizacao;
	}
	
	public void limpar () {
		System.out.println("limpando!");
	}
	
	public void examinar () {
		System.out.println("examinando!");
	}
	
	public void restaurar () {
		System.out.println("restaurando!");
	}
}
