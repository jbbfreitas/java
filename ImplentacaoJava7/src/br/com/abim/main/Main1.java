package br.com.abim.main;

import br.com.abim.interfaces.Calculavel;
import br.com.abim.pojo.Calculadora;

public class Main1 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Calculavel somadora = new Somadora();
		Double resultado = calc.executarOperacao(10d, 20d, somadora);
		System.out.println(resultado);
		

		Calculavel divisora = new Divisora();
		resultado = calc.executarOperacao(10d, 20d, divisora);
		System.out.println(resultado);

	}
	
	static class Somadora implements Calculavel {

		@Override
		public Double executarOperacao(Double a, Double b) {
			return a+b;
		}
		
	}
	static class Divisora implements Calculavel {

		@Override
		public Double executarOperacao(Double a, Double b) {
			return a/b;
		}
		
	}
	
}
