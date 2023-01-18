package Modelo;

public class Data {
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data() {
		
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean eIgual(int d, int m, int a) {
		if((d == dia)&&(m == mes)&&(a==ano)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return (dia + "/" + mes + "/" + ano);
	}
		
}
