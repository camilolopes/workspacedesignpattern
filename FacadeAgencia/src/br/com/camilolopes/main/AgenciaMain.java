package br.com.camilolopes.main;

import br.com.camilolopes.classes.CiaAerea;
import br.com.camilolopes.classes.Cliente;
import br.com.camilolopes.classes.Hotel;
import br.com.camilolopes.facade.AgenciaFacade;

public class AgenciaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Camilo", "Lopes", 25);
		Hotel hotel = new Hotel("Pijamas", 150.00);
		CiaAerea ciaAerea = new CiaAerea("VaEmbora");
		//o facade já sabe qual hotel e ciaAerea notificar 
		AgenciaFacade agencia = new AgenciaFacade(hotel, ciaAerea);
		//informando para agencia o cliente que deseja viajar 
		agencia.registraViagem(cliente);

	}

}
