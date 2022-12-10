package modelo;

public class Contato {
	private String nome, telefone1, telefone2, endereco, relacao;

	public Contato(String nome, String telefone1, String endereco, String relacao) {
		this.nome = nome;
		this.telefone1 = telefone1;
		this.endereco = endereco;
		this.relacao = relacao;
	}
	
	public Contato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRelacao() {
		return relacao;
	}

	public void setRelacao(String relacao) {
		this.relacao = relacao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTelefone1: " + telefone1 + "\nTelefone2: " + telefone2 + "\nEndereco: "
				+ endereco + "\nRelacao: " + relacao;
	}
	public boolean comparaNome (String nome) {
		return this.nome.equalsIgnoreCase(nome);
		
	}

}
