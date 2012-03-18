package br.com.camilolopes.decorator;

import br.com.camilolopes.interfaces.Fabrica;
/*
 * aqui é o nosso decorator 
 */
public abstract class NewFarol implements Fabrica {

	@Override
	public  abstract void farol(String mensagem);	

}
