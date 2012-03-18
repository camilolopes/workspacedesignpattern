package br.com.camilolopes.classes.impl;

import br.com.camilolopes.interfaces.Envio;

/*
 * concreteProduct
 */
public class PessoaFisica implements Envio {

	@Override
	public void enviar(String mensagem) {
		System.out.println(mensagem + "CPF ");
	}

}
