/**
 * Controller criado para representar o login.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro e Ariel Benvindo
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.CadastroInstituicao;
import view.LoginGUI;

public class ControllerLoginGUI {
	
	private LoginGUI login;
	private CadastroInstituicao inicial;
	private ControllerInstituicaoGUI instituicao;
	/**
	 * Método que identifica a ação do usuário
	 * @param login
	 */
	public ControllerLoginGUI(LoginGUI login) {
		this.login = login;
		Handler ouvinte = new Handler();
		login.adicionarOuvinte(ouvinte);
	}
	/**
	 * Método que avalia as informações passadas pelo usuário para realizar o login
	 */
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == login.getBtnEntrar()) {
				String nome = login.getTextoUsuario();
				char[] senha = login.getSenha();
				String pass = new String(senha);
				if(nome.equals("")) {
					JOptionPane.showMessageDialog(login.getContentPane(), "Preencha o campo nome!", "Atenção",2);
				}else {
					if(pass.equals("")) {
						JOptionPane.showMessageDialog(login.getContentPane(), "Preencha o campo senha!", "Atenção",2);
					}else {
						if(nome.equals("user") && pass.equals("12345")){
							login.dispose();
							inicial = new CadastroInstituicao();
							instituicao = new ControllerInstituicaoGUI(inicial);
							inicial.setVisible(true);
						}
					}
				}
			}
		}
	}
}
