package br.com.fiapride.model;

public class Veiculo {

	// Atributos privados
	private String nomeDoDono;
	private String placa;
	private double combustivel;

	// Coloca gasolina no tanque
	public void abastecer(double litros) {
		if (litros <= 0) {
			System.out.println("Erro: a quantidade precisa ser maior que zero.");
		} else {
			combustivel = combustivel + litros;
		}
	}

	// Gasta gasolina do tanque
	public void consumir(double litros) {
		if (litros <= 0) {
			System.out.println("Erro: a quantidade precisa ser maior que zero.");
		} else if (litros > combustivel) {
			System.out.println("Erro: combustivel insuficiente! Tem apenas " + combustivel + " litros.");
		} else {
			combustivel = combustivel - litros;
		}
	}

	// Retorna o nome do dono
	public String getNomeDoDono() {
		return nomeDoDono;
	}

	// Define o nome do dono
	public void setNomeDoDono(String nomeDoDono) {
		if (nomeDoDono == null || nomeDoDono.isEmpty()) {
			System.out.println("Erro: nome invalido.");
		} else {
			this.nomeDoDono = nomeDoDono;
		}
	}
	
	// Retorna a placa
	public String getPlaca() {
		return placa;
	}

	// Define a placa
	public void setPlaca(String placa) {
		if (placa == null || placa.isEmpty()) {
			System.out.println("Erro: placa invalida.");
		} else {
			this.placa = placa;
		}
	}

	// So tem getter: o combustivel muda apenas por abastecer() ou consumir()
	public double getCombustivel() {
		return combustivel;
	}
}
