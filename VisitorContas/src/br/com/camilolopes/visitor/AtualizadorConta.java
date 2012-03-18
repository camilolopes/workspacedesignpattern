package br.com.camilolopes.visitor;

import br.com.camilolopes.classes.ContaCorrente;
import br.com.camilolopes.classes.ContaPoupanca;
/*O tal do Visitor que define os objetos responsaveis 
 * pelas atualizações: Conta Corrente & Conta Poupança 
 */
public interface AtualizadorConta {
	void atualiza(ContaCorrente contaCorrente);
	void atualiza(ContaPoupanca contaPoupanca);
}
