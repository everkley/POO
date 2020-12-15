package atividade2b;
import atividade2a.Telefone;
public class TestaTelefone {

	public static void main(String[] args) {
		Telefone T = new Telefone();
		T.setDucacaoLigacao(5);
		T.setAlterarPreco(5.0);
		T.mostrarConta();
	}
}
