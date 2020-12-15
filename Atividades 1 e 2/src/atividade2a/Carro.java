package atividade2a;

public class Carro {
	private double velocidade=0.0;
	
	public Carro() {

	}
	
	public void acelerar(){
		velocidade = velocidade + 10;
	}
	public void freiar() {
		velocidade = velocidade - 10;
	}
	public void mostrarVelocidade() {
		System.out.println("Velocidade Atual " + velocidade);
	}
}
