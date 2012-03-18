package br.com.camilolopes.bridge.interfaces;
/*
 * essa interface serão implementadas pelo 
 * tipos de arquivos suportados a serem gerados 
 * txt,pdf,zip,doc etc
 */
public interface GeradorDeArquivo {
	void criarArquivo(String dados);
}
