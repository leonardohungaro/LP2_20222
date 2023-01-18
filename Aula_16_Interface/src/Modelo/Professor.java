package Modelo;

abstract class Professor {
	private String nome, matricula, tipo;
	private Data dtNasc;
	
	public Professor(String nome, String matricula, String tipo, Data dtNasc) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		this.dtNasc = dtNasc;
	}
	
	public Professor() {

	}
	
	public abstract String exibirDados();
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nMatricula: " + matricula + "\nTipo: " + tipo + "\nData de Nascimento: " + dtNasc;
	}
	
}
