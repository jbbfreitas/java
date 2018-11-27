package br.com.abim.pojo;

import java.util.function.BinaryOperator;


public class Calculadora {
	
	public <T> T calcular(T a, T b, BinaryOperator<T> c) {
		return c.apply(a, b);
	}
}
