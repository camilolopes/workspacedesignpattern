package br.com.camilolopes.classes;

import br.com.camilolopes.visitor.AtualizadorConta;

public class ContaCorrente extends Conta{
	
	private double saldo;
	

	public ContaCorrente(double saldo) {
		super(saldo);
		this.saldo = saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		
		return saldo;
	}

	@Override
	public void atualiza(AtualizadorConta atualizadorConta) {
		atualizadorConta.atualiza(this);
		
	}
	
}
