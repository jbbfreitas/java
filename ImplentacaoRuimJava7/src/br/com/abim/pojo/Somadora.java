package br.com.abim.pojo;

import br.com.abim.interfaces.Calculavel;

public class Somadora implements Calculavel{

	@Override
	public Double executarOperacao(Double a, Double b) {
		return a+b;
	}

}
