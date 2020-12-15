package atividade1a;

public class Pessoa {

	private String nome;
	private int idade;
	private float altura,peso,imc;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, int idade, float altura, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void imc() {
		imc = peso / (altura * altura);
	}
	public void imprimir() {
		System.out.println("Nome " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Altura " + altura);
		System.out.println("Peso " + peso + " kg");
		System.out.println("IMC " + imc);
		System.out.println("Classificação");
		if(imc<25) {
			System.out.println("abaixo do peso");
		}else if(imc >= 25 && imc <30) {
			System.out.println("Peso ideal(parabéns)");
		}else if(imc >=30 && imc <35) {
			System.out.println("Levemente acima do peso");
		}else if(imc >=35 && imc < 40) {
			System.out.println("Obesidade grau I");
		}else if(imc >=40) {
			System.out.println("Obesidade grau II (severa)");
		}
	}
}
