package atividade2a;

public class Time {
	private int pontosGanhos=0;
	
	public Time() {
		
	}
	public void ganharPartida() {
		pontosGanhos = pontosGanhos + 3;
	}
	public void empatarPartida() {
		pontosGanhos = pontosGanhos + 1;
		
	}
	public void perderPartida() {  // metodo criado apenas pois o exercicio exige, sem função. 
		pontosGanhos = pontosGanhos + 0; 
	}
	public void mostrarPontos() {
		System.out.println(pontosGanhos);
	}
}
