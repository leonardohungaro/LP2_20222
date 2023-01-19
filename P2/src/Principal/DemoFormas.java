package Principal;
import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoFormas {

	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo;
		retangulo = new Retangulo();
		Circulo circulo;
		circulo = new Circulo();
		Quadrado quadrado;
		quadrado = new Quadrado();
			
		ArrayList<Quadrado>listaQuadrados = new ArrayList<Quadrado>();
		ArrayList<Circulo>listaCirculo = new ArrayList<Circulo>();
		ArrayList<Retangulo>listaRetangulos = new ArrayList<Retangulo>();
		
		do {
			System.out.println("Bem vindo, Selecione qual dos objetos deseja incluir abaixo:");
			System.out.println("1 - Círculo;\n2 - Retangulo;\n3 - Quadrado;\n4 - Sair;");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					System.out.print("\nInforme o raio: ");
					circulo.setRaio(sc.nextFloat());
					listaCirculo.add(circulo);
					break;
				case 2:
					System.out.print("\nInforme o lado do retangulo: ");
					retangulo.setLado(sc.nextFloat());
					System.out.print("\nInforme a altura do retangulo: ");
					retangulo.setAltura(sc.nextFloat());
					listaRetangulos.add(retangulo);
					break;
				case 3:
					System.out.print("\nInforme o lado do quadrado: ");
					quadrado.setLado(sc.nextFloat());
					listaQuadrados.add(quadrado);
					break;
				case 4:
					for (int i=0;i<listaCirculo.size();i++) {
						System.out.println(listaCirculo.get(i));
					}
					for (int i=0;i<listaRetangulos.size();i++) {
						System.out.println(listaRetangulos.get(i));
					}
					for (int i=0;i<listaQuadrados.size();i++) {
						System.out.println(listaQuadrados.get(i));
					}
					break;
			}
		}while (opcao == 4);
		sc.close();
	}

}
