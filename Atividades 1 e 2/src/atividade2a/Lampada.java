package atividade2a;

public class Lampada {

	private int estado = 0;

	public Lampada() {

	}

	public int getEstado() {
		return estado;
	}

	public void ligar() {
		estado = 1;
	}

	public void desligar() {
		estado = 0;
	}

	public void mostrarEstado() {
		if (estado == 1) {
			System.out.println("Ligada");
		} else if (estado == 0) {
			System.out.println("Desligada");
		}
	}

}
