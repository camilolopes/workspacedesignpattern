package br.com.camilolopes.newmodel;
/*
 * aqui é a implementação do novo modelo de tomada 
 */
public class TomadaNova {
	public void on(boolean status){
		System.out.println("Novas tomadas Brs");
		checkEnergia(status);
	}

	private void checkEnergia(boolean status) {
		if (status) {
			System.out.println("controle de segurança de energia está " + status);
		}else{
			System.out.println("controle de segurança de energia está " + status);
		}
		
	}

	public void off(boolean status) {
		checkEnergia(status);
		
	}
}
