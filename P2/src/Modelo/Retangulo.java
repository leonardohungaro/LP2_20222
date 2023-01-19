package Modelo;

public class Retangulo implements Forma{
	private float lado, altura;

	public Retangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public Retangulo() {
		
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularArea() {
		return lado*altura;
	}
	public float calcularPerimetro() {
		return (2*(lado+altura));
	}
	
	public String exibeArea() {
		return ("A área do retangulo é "+ calcularArea());
	}
	public String exibePerimetro() {
		return ("O perímetro do retangulo é "+ calcularPerimetro());
	}

	@Override
	public String toString() {
		return ("Lado: " + lado + "\nAltura: " + altura + "\n" + exibeArea() + "\n" + exibePerimetro());
	}
	
}
