package Modelo;

public abstract class Pessoa {
	private String nome, endereco;

	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	public Pessoa() {
		
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\nEndereco: " + endereco;
	}
	
}
