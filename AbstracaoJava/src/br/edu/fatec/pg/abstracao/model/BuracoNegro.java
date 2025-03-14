package br.edu.fatec.pg.abstracao.model;

public class BuracoNegro {
public String nome;
public String tipo;
public int tamanho;

public BuracoNegro(String nome, String tipo, int tamanho) {
    this.nome = nome;
    this.tipo = tipo;
    this.tamanho = tamanho;
}

public void atrair () {
	System.out.println("atraindo objeto!");
}

 public void deformar () {
	 System.out.println("deformando objeto!");
 }
 
 public void engolir () {
	 System.out.println("engolindo objeto!");
 }
 
 
}
