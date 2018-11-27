package br.com.abim.pojo;

import br.com.abim.interfaces.Calculavel;

public class Divisora implements Calculavel{

	@Override
	public Double executarOperacao(Double a, Double b) {
		return a/b;
	}

}
