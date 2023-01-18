package Principal;

import Modelo.Data;
import Modelo.ProfessorHorista;
import Modelo.ProfessorIntegral;

public class DemoProfessor {

	public static void main(String[] args) {
		ProfessorHorista pfh1 = new ProfessorHorista("Luciano", "01" ,"Horista" , new Data(02,07,1992),14.6, 120);
		ProfessorIntegral pfi1 = new ProfessorIntegral("Leonardo", "02" ,"Integral" , new Data(22,12,1988),2000);
		System.out.println(pfh1.exibirDados()+"\n");
		System.out.println(pfi1.exibirDados()+"\n");
	}

}
