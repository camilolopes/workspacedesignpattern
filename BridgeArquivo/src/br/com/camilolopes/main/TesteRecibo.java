package br.com.camilolopes.main;

import br.com.camilolopes.bridge.classes.GeradorArquivoTxt;
import br.com.camilolopes.classes.Recibo;

public class TesteRecibo {
	
	public static void main(String[] args) {
	GeradorArquivoTxt arquivoTxt = new GeradorArquivoTxt(); 
	Recibo reciboAbril = new Recibo("XX", "Camilo Lopes", 50.00, arquivoTxt);
		reciboAbril.geraArquivo();
	}
}
