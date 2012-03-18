package com.camilolopes.classes.impl;

import java.util.Calendar;

import com.camilolopes.interfaces.Boleto;
import com.camilolopes.interfaces.BoletoBuilder;

/*
 * a instituicao tem um criador de boletos 
 */
public class ItauBoletoBuilder implements BoletoBuilder {

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNro;	

	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;

	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;

	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;

	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;

	}

	@Override
	public void buildNossoNro(int nossoNro) {
		this.nossoNro = nossoNro;

	}


	@Override
	public Boleto getBoleto() {
		
		return new ItauBoleto(sacado,cedente,valor,vencimento,nossoNro);
	}

}
