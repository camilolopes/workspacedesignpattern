package br.com.camilolopes.classes;

import br.com.camilolopes.interfaces.Atualizavel;

public abstract class Conta implements Atualizavel {

	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
