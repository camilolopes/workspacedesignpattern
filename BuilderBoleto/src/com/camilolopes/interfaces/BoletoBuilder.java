package com.camilolopes.interfaces;

import java.util.Calendar;

/*
 * interface para criação do Product 
 */
public interface BoletoBuilder {
	void buildSacado(String sacado); 
	void buildCedente(String cedente); 
	void buildValor(double valor); 
	void buildVencimento(Calendar vencimento);
	void buildNossoNro(int nossoNro);
	
	Boleto getBoleto();
}
