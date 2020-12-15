package atividade1a;

public class TesteImc {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Evercley");
		p1.setAltura(1.82f);
		p1.setIdade(23);
		p1.setPeso(89);
		p1.imc();
		p1.imprimir();
	}
}
