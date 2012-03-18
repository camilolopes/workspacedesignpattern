package br.com.camilolopes.main;

import br.com.camilolopes.classes.impl.PessoaFisica;
import br.com.camilolopes.classes.impl.PessoaJuridica;
import br.com.camilolopes.creator.CreatorEnvio;
import br.com.camilolopes.interfaces.Envio;

public class MainPessoa {
	
	
public static void main(String[] args) {
	CreatorEnvio creator = new CreatorEnvio();	
	
	//enviando mensagem para pessoa fisica
	Envio envio = creator.getEnvio(new PessoaFisica());
	envio.enviar("seu cliente inscrito no ");
	
	//enviando para pessoa juridica
	envio = creator.getEnvio(new PessoaJuridica()); 
	envio.enviar("Prezada Empresa inscrita no ");
}
}