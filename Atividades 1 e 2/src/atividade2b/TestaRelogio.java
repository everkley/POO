package atividade2b;
import atividade2a.Relogio;
public class TestaRelogio {

	public static void main(String[] args) {
		Relogio R = new Relogio();
	
		R.mostrarHora();
		R.subtrairHora();
		R.mostrarHora();
		R.adicionarHora();
		R.mostrarHora();
		for(int i=0; i<18; i++) {
			R.adicionarHora();
		}
		R.mostrarHora();
		R.subtrairHora();
		R.mostrarHora();
		R.adicionarHora();
		R.mostrarHora();
	}
}
