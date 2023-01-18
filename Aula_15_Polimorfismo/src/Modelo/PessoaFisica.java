package Modelo;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private Data dtNasc;
	
	public PessoaFisica(String nome, String endereco, String cpf, Data dtNasc) {
		super(nome, endereco);
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}

	@Override
	public String toString() {
		return (super.toString()+"\nCPF: " + cpf + "\nData de Nascimento: " + dtNasc+"\n");
	}	
}
