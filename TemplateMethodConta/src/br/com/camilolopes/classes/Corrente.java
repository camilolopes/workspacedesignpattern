package br.com.camilolopes.classes;

import br.com.camilolopes.templatemethod.Conta;

public class Corrente extends Conta {

	@Override
	public double taxaConta() {

		return 0.1;
	}
}
