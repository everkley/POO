package atividade2b;
import atividade2a.Lampada;

public class TestaLampada {

	public static void main(String[] args) {
		Lampada L = new Lampada();
		L.mostrarEstado();
		L.ligar();
		L.mostrarEstado();
		L.desligar();
		L.mostrarEstado();
	}
}
