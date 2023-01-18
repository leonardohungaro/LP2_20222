package Modelo;

public class Pessoa {
	private String nome, cpf;
	private Data dtNasc;
	
	public Pessoa(String n, String cpf, Data d) {
		this.nome = n;
		this.cpf = cpf;
		dtNasc = d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Data getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}

	@Override
	public String toString() {
		return ("Nome: " + nome + "\nCPF: " + cpf + "\nDara de Nascimento: " + dtNasc);
	}
	
}
