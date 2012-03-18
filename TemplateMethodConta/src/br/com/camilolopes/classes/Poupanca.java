package br.com.camilolopes.classes;

import br.com.camilolopes.templatemethod.Conta;
/*
 * classe que implementa o método abstract que sao utilizados pelos templates methods
 */
public class Poupanca extends Conta {

	@Override
	public double taxaConta() {
		
		return 0.5;
	}

}
