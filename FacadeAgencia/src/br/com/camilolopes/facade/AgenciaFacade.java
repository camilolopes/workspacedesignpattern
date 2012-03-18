package br.com.camilolopes.facade;

import br.com.camilolopes.classes.CiaAerea;
import br.com.camilolopes.classes.Cliente;
import br.com.camilolopes.classes.Hotel;
/*
 * A classe facade que é responsável por 
 * notificar as demais classes
 */
public class AgenciaFacade {
	/*observe que a class facade é do tipo de relacionamento HAS-An
	 * com as classes que vão receber a notificação 
	 */
	private Hotel hotel; 
	private CiaAerea ciaAerea;
	
	public AgenciaFacade(Hotel hotel, CiaAerea ciaAerea) {
		super();
		this.hotel = hotel;
		this.ciaAerea = ciaAerea;
	}
	//aqui que acontece as notificações para  as dependências
	public void registraViagem(Cliente cliente){
		this.hotel.registraReserva(cliente.getNome(),cliente.getSobreNome());
		this.ciaAerea.reservaVoo(cliente.getNome(),cliente.getSobreNome());
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public CiaAerea getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(CiaAerea ciaAerea) {
		this.ciaAerea = ciaAerea;
	}
}
