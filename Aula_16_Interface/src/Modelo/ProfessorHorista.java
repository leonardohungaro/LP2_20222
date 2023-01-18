package Modelo;

public class ProfessorHorista extends Professor {
	private double ValorHoraAula, HorasTrabalhadas;

	public ProfessorHorista(String nome, String matricula, String tipo, Data dtNasc, double valorHoraAula, double horasTrabalhadas) {
		super(nome, matricula, tipo, dtNasc);
		this.ValorHoraAula = valorHoraAula;
		this.HorasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHoraAula() {
		return ValorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		ValorHoraAula = valorHoraAula;
	}

	public double getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}
	
	public double getSalario() {
		return (ValorHoraAula*HorasTrabalhadas);
	}

	@Override
	public String toString() {
		return (super.toString()+"\nValor Hora Aula: " + ValorHoraAula + "\nHoras Trabalhadas: " + HorasTrabalhadas);
	}
	
	public String exibirDados() {
		return (toString() + "\nSalario: $" + getSalario());
	}
}
