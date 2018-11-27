package br.com.abim.main;

import br.com.abim.interfaces.Calculavel;
import br.com.abim.pojo.Calculadora;

public class Main2 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Double resultado = calc.executarOperacao(10d, 20d, new Calculavel() {
			@Override
			public Double executarOperacao(Double a, Double b) {
				return a + b;
			}
		});
		System.out.println(resultado);

		resultado = calc.executarOperacao(10d, 20d, new Calculavel() {
			@Override
			public Double executarOperacao(Double a, Double b) {
				return a / b;
			}
		});
		System.out.println(resultado);

	}
}
