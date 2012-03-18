package com.camilolopes.generator;

import java.util.Calendar;

import com.camilolopes.interfaces.Boleto;
import com.camilolopes.interfaces.BoletoBuilder;
/*
 * classe que gera o boleto a partir do xxBuilder
 */
public class GeneratorBoleto {
	//código orientado a interfaces
	private BoletoBuilder boletoBuilder;
	//espero um objeto que implemente o criador de boleto
	public GeneratorBoleto(BoletoBuilder boletoBuilder) {
		super();
		this.boletoBuilder = boletoBuilder;
	} 
	public Boleto geraBoleto(){
	//informações sobre o boleto a ser gerado
		boletoBuilder.buildSacado("Camilo Lopes");
		boletoBuilder.buildCedente("Disney");
		boletoBuilder.buildValor(2000.00);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 20);
		boletoBuilder.buildVencimento(vencimento);
		boletoBuilder.buildNossoNro(1234);
	//olha isso aqui que mágico
		Boleto boleto = boletoBuilder.getBoleto();
		return boleto;
	}
}