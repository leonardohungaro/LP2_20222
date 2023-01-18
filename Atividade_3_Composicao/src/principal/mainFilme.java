package principal;
import modelo.*;
import java.util.*;


public class mainFilme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, resp;
		Diretor d;
		Filme f1;
		ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
		do {
			System.out.println("\nEscolha uma das opções abaixo:");
			System.out.println(
					"\n1 - Cadastro de Filmes;\n2 - Consulta de Filmes;\n3 - Sair;");
			System.out.print("\nInforme a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					do {
						f1 = new Filme();
						d = new Diretor();
						System.out.print("\nInforme o nome do Filme: ");
						f1.setTitulo(sc.next());
						System.out.print("\nInforme a descrição do filme: ");
						f1.setDescricao(sc.next());
						System.out.print("\nInforme a duração em minutos do filme: ");
						f1.setDuracao(sc.nextInt());
						System.out.print("\nInforme o diretor do filme: ");
						d.setNome(sc.next());
						System.out.print("\nInforme a origem do diretor: ");
						d.setOrigem(sc.next());
						System.out.print("\nInforme os anos de experiência do diretor: ");
						d.setAnosExp(sc.nextInt());
						f1.setDir(d);
						listaFilmes.add(f1);
						System.out.println("\nInclusão efetuada com sucesso!!!");
						System.out.println("\nDigite a opção desejada:\n1 - Adicionar outro Filmes;\n2 - Sair;");
						System.out.println("\nInforme a opção desejada: ");
						resp = sc.nextInt();
					}while (resp != 2);
					break;
				case 2:
					int count = 0;
					if (listaFilmes.size()!= 0) {
						System.out.print("Informe o nome do filme: ");
						String consultaFilme = sc.next();
						for (int i =0;i<listaFilmes.size();i++) {
							if(listaFilmes.get(i).acheiVoce(consultaFilme)) {
								System.out.println(listaFilmes.get(i));
								count = count++;
								break;
							}
						}
						if (count == 0) {
							System.out.println("\nNão existe nenhum filme com o nome informado!!");
						}
					}else {
						System.out.print("\nNão há filmes cadastrados, favor cadastrar ao menos um filme!!\n");
					}
					break;
				case 3:
					if (listaFilmes.size()!=0) {
						for (int i=0;i<listaFilmes.size();i++) {
							System.out.println("\nTitulo: "+ listaFilmes.get(i).getTitulo() +"\nDuração: "+ listaFilmes.get(i).qtdHora() + " Horas");
						}
					}else {
						System.out.print("\nNenhum filme foi cadastrado!!\n");
					}
					System.out.println("\nAté a próxima!!");
					break;
			}
		}while(opcao !=3);
		sc.close();
	}
}
