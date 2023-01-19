package Modelo;

public class Quadrado implements Forma{
	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}
	public Quadrado() {
		
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float calcularArea() {
		return lado*lado;
	}
	public float calcularPerimetro() {
		return 4*lado;
	}
	
	public String exibeArea() {
		return ("A área do quadrado é "+ calcularArea());
	}
	public String exibePerimetro() {
		return ("O perímetro do quadrado é "+ calcularPerimetro());
	}
	@Override
	public String toString() {
		return ("Lado: "+lado+"\n"+exibeArea()+"\n"+exibePerimetro());
	}
	
}
