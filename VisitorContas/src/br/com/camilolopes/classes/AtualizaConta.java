package br.com.camilolopes.classes;

import br.com.camilolopes.visitor.AtualizadorConta;
/*ConcreteVisitor 
 * Classe que faz atualização das contas 
 */
public class AtualizaConta implements AtualizadorConta {

	@Override
	public void atualiza(ContaCorrente contaCorrente) {
		contaCorrente.setSaldo(contaCorrente.getSaldo() + contaCorrente.getSaldo() * 0.00);

	}

	@Override
	public void atualiza(ContaPoupanca contaPoupanca) {
		contaPoupanca.setSaldo(contaPoupanca.getSaldo() + contaPoupanca.getSaldo()* 0.5);

	}

}
