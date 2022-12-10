package principal;
import java.util.*;
import modelo.Contato;

public class MainContatos {

	public static void main(String[] args) {
		int opcao, teste;
		String nome;
		Scanner sc = new Scanner(System.in); 
		Contato pessoa;
		pessoa = new Contato();
		ArrayList<Contato>listaContatos = new ArrayList<Contato>();

		do {
			boolean existe;
			System.out.println("Bem vindo, Selecione uma das opções abaixo:");
			System.out.println("1 - Cadastrar;\n2 - Consultar;\n3 - Excluir;\n4 - Listar todos os contatos;\n5 - Sair;");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					System.out.print("\nInforme o nome do contato: ");
					pessoa.setNome(sc.next());
					System.out.print("\nInforme o telefone do contato: ");
					pessoa.setTelefone1(sc.next());
					System.out.print("\nInforme o endereço do contato: ");
					pessoa.setEndereco(sc.next());
					System.out.print("\nInforme a relação do contato: ");
					pessoa.setRelacao(sc.next());
					listaContatos.add(pessoa);
					System.out.println("\nCadastro concluído com sucesso!!\n");
					break;
				case 2:
					System.out.print("Informe o nome do contato: ");
					nome = sc.next();
					if(listaContatos.size()!=0) {
						for (int i=0;i<listaContatos.size();i++) {
							existe = listaContatos.get(i).comparaNome(nome); 
							if (existe == true) {
								System.out.println(listaContatos.get(i));
							}
						}
					}
					else {
						System.out.println("Não há contatos cadastrados, favor incluir ao menos um contato!!");
					}
					break;
				case 3:
					System.out.print("Informe o nome do contato: ");
					nome = sc.next();
					if(listaContatos.size()!=0) {
						for (int i=0;i<listaContatos.size();i++) {
							existe = listaContatos.get(i).comparaNome(nome); 
							if (existe == true) {
								System.out.println(listaContatos.get(i));
								System.out.print("Para apagar digite 1, próximo contato digite 0: ");
								teste = sc.nextInt();
								if (teste==1) {
									listaContatos.remove(i);
									break; //Essa função eu não inclui para prova
								}
							}
						}
					}
					else {
						System.out.println("Não há contatos cadastrados, favor incluir ao menos um contato!!");
					}
					break;
				case 4:
					if(listaContatos.size()!=0) {
						for (int i=0;i<listaContatos.size();i++) {
							System.out.println(listaContatos.get(i));
						}
					}
					else {
						System.out.println("Não há contatos cadastrados, favor incluir ao menos um contato!!");
					}
					break;
				case 5:
					System.out.println("Sair");
					break;
				default:
					System.out.println("\nNão foi informado uma opção válida!!");
			}
		}while(opcao!=5);
		sc.close();
		System.out.print("\nFim da Questão 2!!");
	}

}
