package br.com.camilolopes.classes;

import br.com.camilolopes.interfaces.Fabrica;

public class Fox implements Fabrica {

	@Override
	public void farol(String mensagem) {
		System.out.println("adicionando farois comuns ao " + mensagem);
		
	}

}
