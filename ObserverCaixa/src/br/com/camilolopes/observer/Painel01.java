package br.com.camilolopes.observer;

import br.com.camilolopes.classes.Caixa;
/*
 * o interessado em saber a mudança
 * do status 
 */
public class Painel01 implements Observer {

	@Override
	public void notificaPainel(Caixa caixa) {
		System.out.println("O " + caixa.getNomeCaixa() + " está disponivel.Status alterado para " + caixa.isStatus());
	}

}
