package br.com.abim.pojo;

import br.com.abim.interfaces.Calculavel;

public class Calculadora   {
		
	public Double executarOperacao(Double a, Double b, Calculavel c) {
		Double resultado = c.executarOperacao(a, b);
		return resultado;
	}
	
	
}
