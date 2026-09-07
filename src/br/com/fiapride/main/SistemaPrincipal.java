package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo();

		v1.setNomeDoDono("Nicolas");
		v1.setPlaca("ABC-1234");

		v1.abastecer(-10);     // erro: negativo
		v1.abastecer(50);      // ok
		v1.consumir(100);      // erro: so tem 50
		v1.consumir(-50);      // erro: negativo
		v1.consumir(20);       // ok

		System.out.println("Dono: " + v1.getNomeDoDono()
				+ " | Placa: " + v1.getPlaca()
				+ " | Gasolina: " + v1.getCombustivel());
	}
}