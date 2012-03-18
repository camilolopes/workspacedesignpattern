package br.com.camilolopes.classes;

public class Hotel {
	private String nome; 
	private double valorDiaria;
	public Hotel(String nome, double valorDiaria) {
		super();
		this.nome = nome;
		this.valorDiaria = valorDiaria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public void registraReserva(String nomeCliente, String sobreNomeCliente) {
	System.out.println("o Hotel " + this.nome + " informa que a reserva para ");
	System.out.println(nomeCliente + " " + sobreNomeCliente + " foi realizada com sucesso");
		
	} 
	
	
}
