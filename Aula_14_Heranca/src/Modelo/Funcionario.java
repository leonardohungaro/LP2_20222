package Modelo;

public class Funcionario extends Pessoa {
	private Data dtAdm;
	private double salario;
	
	public Funcionario(String nome, String cpf, Data dtNasc, Data dtAdm, double salario) {
		super(nome, cpf, dtNasc);
		this.dtAdm = dtAdm;
		this.salario = salario;
	}
	
	public Funcionario(Pessoa p, Data adm, float sal) {
		super(p.getNome(), p.getCpf(), p.getDtNasc());
		dtAdm = adm;
		salario = sal;
	}



	public Data getDtAdm() {
		return dtAdm;
	}

	public void setDtAdm(Data dtAdm) {
		this.dtAdm = dtAdm;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return(super.toString()+"\nData de admissão: " + dtAdm + "\nSalario: " + salario + "\n");
	}
	
	final public void reajustarSalario(double reaj){
		this.salario+=this.salario*reaj;
		}
	
	public double getBonificacao() {
		return this.salario * 0.1;
		}

}
