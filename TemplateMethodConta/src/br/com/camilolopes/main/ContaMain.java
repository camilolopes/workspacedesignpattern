package br.com.camilolopes.main;

import br.com.camilolopes.classes.Corrente;
import br.com.camilolopes.classes.Poupanca;

public class ContaMain {
	public static void main(String[] args) {
		Corrente corrente = new Corrente();
		corrente.deposita(100.00);
		corrente.saque(10.00);
		System.out.println("Saldo em conta corrente " + corrente.getSaldo());
		Poupanca poupanca = new Poupanca();
		poupanca.deposita(100.00);
		poupanca.saque(10.00);
		System.out.println("Saldo em Poupança " + poupanca.getSaldo());

	}
}
