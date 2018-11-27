package br.com.abim.pojo;

import br.com.abim.interfaces.Calculavel;

public class Calculadora {
	
	public Double calcular(Double a, Double b, Calculavel c) {
		return c.realizarOperacao(a, b);
	}
}
