package Modelo;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}
	public PessoaJuridica() {
		
	}
	@Override
	public String toString() {
		return (super.toString()+"\nCNPJ: " + cnpj);
	}
	
}