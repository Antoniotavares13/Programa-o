package br.edu.fatec.pg.abstracao.model;

public class Ceramica {
	
	public String tipo;
    public String cor;
    public double tamanho;
    
    
    public Ceramica(String tipo, String cor, double tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    public void queimar () {
		System.out.println("queimando!");
	}
	
	public void modelar () {
		System.out.println("modelando!");
	}
	
	public void rachar () {
		System.out.println("rachou!");
	}
    
}
