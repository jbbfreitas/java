package br.com.abim.main;

import br.com.abim.pojo.Divisora;
import br.com.abim.pojo.Somadora;

public class Main {

	public static void main(String[] args) {
		Somadora somadora = new Somadora();
		Double resultado = somadora.executarOperacao(10d, 20d);
		System.out.println(resultado);


		Divisora divisora = new Divisora();
		resultado = divisora.executarOperacao(10d, 20d);
		System.out.println(resultado);

	}
}
