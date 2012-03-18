package br.com.camilolopes.main;

import br.com.camilolopes.classes.Fox;
import br.com.camilolopes.decorator.NewFox;
import br.com.camilolopes.interfaces.Fabrica;

public class FabricaMain {

	public static void main(String[] args) {
		// chegou na esteira o modelo newFox
		Fabrica fabrica1 = new NewFox();
		fabrica1.farol("New Fox");
		//chegou na esteira o modelo fox
		Fabrica fabrica2 = new Fox();
		fabrica2.farol("Fox");

	}

}
