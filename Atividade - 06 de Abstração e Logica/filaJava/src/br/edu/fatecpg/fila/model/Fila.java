package br.edu.fatecpg.fila.model;

public class Fila {
private int nPacientes;
private int consultorio;
private String medico;

public Fila (int pacientes, int consultorio, String medico) {
	this.nPacientes = pacientes;
	this.consultorio = consultorio;
	this.medico = medico;
}

public int getNPacientes () {
	return nPacientes;
}
public void setNPacientes(int pacientes) {
	this.nPacientes = pacientes;
}


public int getConsultorio () {
	return consultorio;
}

public void setConsultorio(int consultorio) {
	this.consultorio = consultorio;
}

public String getMedico() {
	return medico;
}

public void setMedico(String medico) {
	this.medico = medico;
}

public void chegar(int qtd) {
	this.nPacientes += qtd;
	System.out.println("quantidade de pessoas na fila: " + this.nPacientes);
}

public void chamar (int qtd) {
	if(qtd > 2) {
		System.out.println("só pode chamar 2 pacientes por vez");
	}else {
		this.nPacientes -= qtd;
		System.out.println("quantidade de pessoas na fila: " + this.nPacientes);
	}
}

public void atender (int qtd) {
	if(this.nPacientes > 0 && qtd <= 2){
		System.out.println("Medico atendendo " + qtd);
	}else {
		System.out.println("sem pessoas na fila");
	}
}


}
