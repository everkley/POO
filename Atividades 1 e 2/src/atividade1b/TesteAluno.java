package atividade1b;

public class TesteAluno {

	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.setMatricula(316);
		a1.setNome("Evercley");
		a1.setNota1(3);
		a1.setNota2(6);
		a1.resultado();
		a1.imprimir();
	}
}
