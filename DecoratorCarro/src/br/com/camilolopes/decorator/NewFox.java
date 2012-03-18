package br.com.camilolopes.decorator;

/*
 * classe que vai ter a nova funcionalidade implementada
 * conhecida como: ConcreteDecorator 
 */
public class NewFox extends NewFarol {
	@Override
	public void farol(String mensagem) {
		System.out.println("Adicionando Farol de Neon");
		System.out.println(this.farolNeon() + " ao " + mensagem);
	}
	
	//nova funcionalidade sendo adicionado ao farol
	public String farolNeon() {
		return "Farol de neon adicionado com sucesso";
	}
}
