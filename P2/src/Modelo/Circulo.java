package Modelo;

public class Circulo implements Forma{
	private float raio;
	private final float pi = (float) 3.14;

	public Circulo(float raio) {
		this.raio = raio;
	}
	public Circulo() {
		
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float calcularArea() {
		return pi*(raio*raio);
	}
	public float calcularPerimetro() {
		return (2*pi*raio);
	}
	
	public String exibeArea() {
		return ("A área do círculo é "+ calcularArea());
	}
	public String exibePerimetro() {
		return ("O perímetro do círculo é "+ calcularPerimetro());
	}
	@Override
	public String toString() {
		return "Raio: " + raio + "\n"+exibeArea()+"\n"+exibePerimetro();
	}	
}
