package br.com.camilolopes.classes;

import java.util.HashSet;
import java.util.Set;

import br.com.camilolopes.observer.Observer;

public class Caixa {
	private boolean status = false; 
	//apenas os caixas  que estão funcionando serão os interessados
	private Set<Observer> interessados = new HashSet<Observer>();
	private String nomeCaixa;
	
	//todo caixa tem um nome + um nro. 
	public Caixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}
	public boolean isStatus() {
		return status;
	}
	/*
	 * quando o status é alterado
	 * notifica o painel  
	 */
	public void setStatus(boolean status) {
		this.status = status;
		/*
		 * A mágica está aqui. Notificados o painel que o caixa 
		 * foi alterado. No nosso caso temos apenas um Painel, mas
		 * poderiamos ter N paineis.Observe quantos paineis temos 
		 * em uma agência bancaria: Um para pesso fisica, caixa rápido
		 * pessoa juridica etc. Cada um associado a um tipo de caixa(01,02...)
		 */
		for(Observer interessado : interessados){
			interessado.notificaPainel(this);
		}
	}	
	public void registraInteressado(Observer interessado){
		this.interessados.add(interessado);
	}
	public String getNomeCaixa() {
		return nomeCaixa;
	}
	public void setNomeCaixa(String nomeCaixa) {
		this.nomeCaixa = nomeCaixa;
	}
	
}
