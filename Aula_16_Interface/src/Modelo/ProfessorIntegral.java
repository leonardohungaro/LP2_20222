package Modelo;

public class ProfessorIntegral extends Professor{
	private double salario;

	public ProfessorIntegral(String nome, String matricula, String tipo, Data dtNasc, double salario) {
		super(nome, matricula, tipo, dtNasc);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nSalario: $" + salario);
	}
	
	public String exibirDados() {
		return (toString());
	}
}
