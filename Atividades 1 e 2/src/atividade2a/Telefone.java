package atividade2a;

public class Telefone {
	private int numMinutos = 0;
	private double preco = 2.0;

	public Telefone(){
		
	}
	public void setDucacaoLigacao(int a) {
		this.numMinutos = a;
	}
	public void setAlterarPreco(double p) {
		this.preco = p;
	}
	public void mostrarConta() {
		System.out.println("O Valor da conta é R$ " + numMinutos * preco);
	}
}