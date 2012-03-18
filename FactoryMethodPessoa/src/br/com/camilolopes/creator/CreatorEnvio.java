
package br.com.camilolopes.creator;

import br.com.camilolopes.interfaces.Envio;
/*
 * classe que vai retornar o metodo implementado 
 * com base no tipo que recebeu 
 */	
public class CreatorEnvio { 
	
public Envio getEnvio(Envio envio){
	if (envio==null) {
		throw new NullPointerException();
	}
	return envio;
}
}
