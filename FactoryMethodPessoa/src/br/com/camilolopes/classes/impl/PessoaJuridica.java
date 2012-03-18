package br.com.camilolopes.classes.impl;

import br.com.camilolopes.interfaces.Envio;

/*
 * ConcreteProduct
 */
public class PessoaJuridica implements Envio {

	@Override
	public void enviar(String mensagem) {
		System.out.println(mensagem + "CNPJ");

	}

}
