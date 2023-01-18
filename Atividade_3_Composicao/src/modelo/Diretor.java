package modelo;

public class Diretor {
	private String nome, origem;
	private int anosExp;
	
	public Diretor(String nome, String origem, int anosExp) {
		this.nome = nome;
		this.origem = origem;
		this.anosExp = anosExp;
	}
	public Diretor() {

	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getAnosExp() {
		return anosExp;
	}

	public void setAnosExp(int anosExp) {
		this.anosExp = anosExp;
	}

	
	public String toString() {
		return "Nome: " + nome + "Origem: " + origem + "Experiência: " + anosExp;
	}
	
}
