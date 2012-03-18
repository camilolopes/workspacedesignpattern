package br.com.camilolopes.classes;

import br.com.camilolopes.interfaces.state.Bandeira;
/*
 * classe que mantém referencia para um State com base no estado atual
 */
public class Taximetro {
	/*um taximetro has-a bandeira
	 * ou seja, para um taximetro ter vida 
	 * ele precisa estar associado com uma bandeira
	 */
	private Bandeira bandeira;

	public Taximetro(Bandeira bandeira) {
		super();
		this.bandeira = bandeira;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	} 
	//aqui o taximetro vai calcular c/ base no tipo de Bandeira
	public double calculaCorrida(double distancia){
		double totalCorrida = bandeira.calculoBandeira(distancia);
	return totalCorrida;
	}
}
