package Principal;
import Modelo.Data;
import Modelo.Pessoa;
import Modelo.Funcionario;
import Modelo.ChefeDeDepartamento;

public class DemoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Beatriz de Souza", "22145236598", new Data(03,10,1980));
		Funcionario f1 = new Funcionario("João Carlos","11542365896", new Data(5,8,1960), new Data(15,10,2000),2500f);
		Funcionario f2 = new Funcionario(p1, new Data(25,6,2020), 4000f);
		ChefeDeDepartamento cf1 = new ChefeDeDepartamento(f1, new Data(01,7,2022), "Contas");
		System.out.println(p1+"\n");
		System.out.println(f1+"\n");
		System.out.println(f2+"\n");
		System.out.println(cf1+"\n");
	}

}
