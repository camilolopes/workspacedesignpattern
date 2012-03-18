package br.com.camilolopes.main;

import java.util.ArrayList;
import java.util.List;

import br.com.camilolopes.classes.AtualizaConta;
import br.com.camilolopes.classes.Banco;
import br.com.camilolopes.classes.Conta;
import br.com.camilolopes.classes.ContaCorrente;
import br.com.camilolopes.classes.ContaPoupanca;

public class VisitorMain {
	
public static void main(String[] args) {
	//lembre-se um banco tem N contas
	List<Banco> lista = new ArrayList<Banco>();
	//criando as contas
	ContaCorrente contaCorrente = new ContaCorrente(100.00);
	ContaPoupanca contaPoupanca = new ContaPoupanca(1000.00);
	//criando o Banco
	Banco bancoX = new Banco();
	
	//adicionando as contas ao Banco
	bancoX.getContas().add(contaPoupanca);
	bancoX.getContas().add(contaCorrente);
	
	lista.add(bancoX);
	
	AtualizaConta atualizaConta = new AtualizaConta();
	//atualizando as contas por Banco
	for(Banco banco : lista){
		banco.atualizando(atualizaConta);
	}
	
	//verificando atualização 
	for(Banco b :lista){
		for(Conta c : b.getContas()){
			System.out.println(c.getClass().getSimpleName() + " " + c.getSaldo());
		}
	}
}
}
