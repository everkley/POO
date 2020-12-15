package atividade1b;

public class Aluno {
	private int matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private float media;
	
	public Aluno() {
		
	}
	public Aluno(int matricula, String nome, float nota1, float nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}
	public int getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	
	public float getNota1() {
		return nota1;
	}
	public float getNome2() {
		return nota2;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public void resultado() {
		media = ((nota1 * 2) + (nota2)) / 2;
	}
	public void imprimir() {
		System.out.println("Matricula "+ matricula);
		System.out.println("Nome "+ nome);
		System.out.println("Nota1 "+ nota1);
		System.out.println("Nota2 "+ nota2);
		System.out.println("Média "+ media);
		System.out.println("Resultado" );
		if(media < 4) {
			System.out.println("Reprovado");
		}else if(media >= 4 && media < 6) {
			System.out.println("Recuperação");
		}else if(media >= 6) {
			System.out.println("Aprovado");
		}
	}
}






