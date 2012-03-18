package br.com.camilolopes.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.camilolopes.visitor.AtualizadorConta;

public class Banco {
	private List<Conta> contas = new ArrayList<Conta>();

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public void atualizando(AtualizadorConta atualizadorConta){
		for (Conta conta :this.contas) {
			 /*aqui que tem a mágica
			  * chama a conta com base no tipo 
			  * evitamos if/else encadeados
			  */
			conta.atualiza(atualizadorConta);
		}
	}
	
}
