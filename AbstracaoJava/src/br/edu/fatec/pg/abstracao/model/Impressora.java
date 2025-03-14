package br.edu.fatec.pg.abstracao.model;

public class Impressora {
public String marca;
public String modelo;
public String cor;

public Impressora(String marca, String modelo, String cor) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
}

public void ligar (){
	System.out.println("Ligado!");
}

public void imprimir () {
	System.out.println("Imprimindo!");
}

public void desligar () {
	System.out.println("desligado!");
}

}
