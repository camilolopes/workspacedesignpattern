package br.com.camilolopes.interfaces;

import br.com.camilolopes.visitor.AtualizadorConta;
/*Element: interface que define os objetos que podem 
 * ser atualizados por um Visitor
 * 
 */
public interface Atualizavel {
	void atualiza(AtualizadorConta atualizadorConta);
}
