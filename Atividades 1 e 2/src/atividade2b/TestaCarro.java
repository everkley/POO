package atividade2b;
import atividade2a.Carro;
public class TestaCarro {

	public static void main(String[] args) {
		Carro C = new Carro();
		C.mostrarVelocidade();
		C.acelerar();
		C.mostrarVelocidade();
		C.freiar();
		C.mostrarVelocidade();
	}
	
}
