package br.com.abim.main;

import br.com.abim.interfaces.Calculavel;
import br.com.abim.pojo.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
        Double resultado=c.calcular(10d, 20d, (a,b) -> a+b) ;
		System.out.println(resultado);
        resultado=c.calcular(10d, 20d, (a,b) -> a/b) ;
		System.out.println(resultado);
        resultado=c.calcular(10d, 20d, (a,b) -> a*b) ;
		System.out.println(resultado);
	}

}
