package Principal;
import Modelo.Data;
import Modelo.Funcionario;
import Modelo.ChefeDeDepartamento;

public class DemoPessoa2 {

	public static void main(String[] args) {
		Data dt = new Data(2,5,1945);
		Funcionario f1;
		Funcionario f2;
		f1 = new Funcionario("Marcos Lins","2256325458",dt,new Data(15,3,2000),3000);
		f2 = new ChefeDeDepartamento("Ana Luiza", "111526666", dt, new Data(20,10,2015), 5000, new Data(22,9,2020), "Financeiro");
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
	}

}
