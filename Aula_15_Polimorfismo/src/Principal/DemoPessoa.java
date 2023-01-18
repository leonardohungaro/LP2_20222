package Principal;
import Modelo.*;

public class DemoPessoa {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("João Silva", "Rua Três, 54, Rio de Janeiro","11236589657", new Data(03,02,2013));
		PessoaJuridica pj1 = new PessoaJuridica("Mercado da Vila", "Rua São João, 467, Vila Rica, Volta Redonda", "5551255");
		System.out.println(pf1);
		System.out.println();
		System.out.println(pj1);

	}

}
