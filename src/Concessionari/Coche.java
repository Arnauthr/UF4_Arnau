package Concessionari;

import Act_UF4.Alumne;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	
	public Coche(String matricula) {
        this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	} 
	
	public String toString() {
		return ("Marca: "+  this.marca +  " Model: " +  this.modelo + " Matrícula: " + this.matricula);
	}
}