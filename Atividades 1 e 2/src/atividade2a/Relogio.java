package atividade2a;

public class Relogio {
	private int hora=6;

	public Relogio() {
	}


	public void adicionarHora() {
		hora = hora +1;
		if (hora > 23) {
			hora = 0;
		}
	}

	public void subtrairHora() {
		hora = hora - 1;
		if (hora < 0) {
			hora = 23;
		}
	}
	public void mostrarHora() {
		System.out.println(hora);
	}
}
