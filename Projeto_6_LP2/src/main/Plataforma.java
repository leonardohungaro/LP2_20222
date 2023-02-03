/**
 * Classe main.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro e Ariel Benvindo
 */
package main;

import controllers.ControllerLoginGUI;
import view.LoginGUI;

public class Plataforma {
	/**
	 * Método que inicializa a execução do aplicação
	 * @param args
	 */
	public static void main(String[] args) {
		
		LoginGUI login = new LoginGUI();
		ControllerLoginGUI controllerLogin = new ControllerLoginGUI(login);
		login.setVisible(true);
	}

}
