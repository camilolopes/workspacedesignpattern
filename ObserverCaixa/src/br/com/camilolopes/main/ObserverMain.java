package br.com.camilolopes.main;

import br.com.camilolopes.classes.Caixa;
import br.com.camilolopes.observer.Painel01;

public class ObserverMain {
	public static void main(String[] args) {
		Painel01 painel01 = new Painel01();
		//poderiamos ter outros paineis para N caixas
		
		//teve o status alterado
		Caixa caixa1 = new Caixa("Caixa 1");
		caixa1.registraInteressado(painel01);		
		caixa1.setStatus(true);
		
		Caixa caixa2 = new Caixa("Caixa 2");
		caixa2.registraInteressado(painel01);
		//nao teve o status alterado
	}
}
