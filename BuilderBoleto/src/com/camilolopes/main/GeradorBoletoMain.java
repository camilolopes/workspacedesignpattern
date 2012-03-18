package com.camilolopes.main;

import com.camilolopes.classes.impl.ItauBoletoBuilder;
import com.camilolopes.generator.GeneratorBoleto;
import com.camilolopes.interfaces.Boleto;
import com.camilolopes.interfaces.BoletoBuilder;

public class GeradorBoletoMain {
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new ItauBoletoBuilder(); 
		GeneratorBoleto generatorBoleto = new GeneratorBoleto(boletoBuilder); //itau
		Boleto boleto = generatorBoleto.geraBoleto();//retorna o boleto pronto
		System.out.println(boleto);
	}

}
