package br.com.abim.main;

import br.com.abim.pojo.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
        Integer resultado=c.calcular(10, 20, (a,b) -> a+b) ;
		System.out.println(resultado);
        Double resultado2=c.calcular(10d, 20d, (a,b) -> a/b) ;
		System.out.println(resultado2);
        Float resultado3=c.calcular(10f, 20f, (a,b) -> a*b) ;
		System.out.println(resultado3);
	}

}
