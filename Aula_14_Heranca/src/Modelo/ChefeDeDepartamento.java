package Modelo;

public class ChefeDeDepartamento extends Funcionario {
	private Data dtPromo;
	private String nomeDep;
	
	public ChefeDeDepartamento(Funcionario f, Data dtPromo, String nomeDep) {
		super(f.getNome(), f.getCpf(), f.getDtNasc(), f.getDtAdm(), f.getSalario());
		this.dtPromo = dtPromo;
		this.nomeDep = nomeDep;
	}
	
	public ChefeDeDepartamento(String nome, String cpf, Data dtNasc, Data dtAdm, double salario, Data dtPromo, String nomeDep) {
		super(nome, cpf, dtNasc, dtAdm, salario);
		this.dtPromo = dtPromo;
		this.nomeDep = nomeDep;
	}



	public Data getDtPromo() {
		return dtPromo;
	}

	public void setDtPromo(Data dtPromo) {
		this.dtPromo = dtPromo;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	@Override
	public String toString() {
		return (super.toString() + "Data da Promoção: " + dtPromo + "\nDepartamento" + nomeDep + "\n");
	}
	
	public double getBonificacao() {
		return super.getBonificacao()+1000;
		}
}
