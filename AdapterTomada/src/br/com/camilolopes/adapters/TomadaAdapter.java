package br.com.camilolopes.adapters;

import br.com.camilolopes.classes.Tomada;
import br.com.camilolopes.newmodel.TomadaNova;
/*
 * criando o adaptador 
 * ele que tem a responsabilidade de chamar o método novo 
 */
public class TomadaAdapter extends Tomada {
	private TomadaNova tomadaNova;
	
	
	public TomadaAdapter() {
	tomadaNova = new TomadaNova();	
	}

	@Override
	public void on() {		
	tomadaNova.on(true);
	}

	@Override
	public void off() {		
	tomadaNova.off(false);
	}

	
}
