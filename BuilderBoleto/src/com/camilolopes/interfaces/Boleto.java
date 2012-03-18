package com.camilolopes.interfaces;

import java.util.Calendar;
/*
 * interface que define o que um boleto 
 * deve ter. qualquer banco quer tem interesse em gerar
 * um boleto deve informar quem é o sacado, cedente 
 * o prazo para pagto e o valor. 
 */
public interface Boleto {
	String getSacado();	
	String getCedente();
	Calendar getVencimento();
	double getValor();
	
}
