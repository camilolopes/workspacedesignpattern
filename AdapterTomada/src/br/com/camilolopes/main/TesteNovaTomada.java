package br.com.camilolopes.main;

import br.com.camilolopes.adapters.TomadaAdapter;
import br.com.camilolopes.classes.Tomada;

public class TesteNovaTomada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * conectando a tomada ao adaptador - adapter
		 */
		Tomada tomada = new TomadaAdapter();
		//ligando a tomada
		tomada.on();
		//desligando a tomada
		tomada.off();

	}

}
