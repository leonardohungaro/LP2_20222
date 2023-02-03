/**
 * View criada para representar o login.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro e Ariel Benvindo
 */
package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JButton btnCadastrar;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setTitle("LOGIN");
		setSize(406, 255);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(97, 27, 48, 25);
		contentPane.add(lblLogin);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(97, 91, 48, 22);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(97, 55, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 117, 200, 25);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(97, 181, 89, 23);
		contentPane.add(btnEntrar);
		
		btnCadastrar = new JButton("Limpar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar();
			}
		});
		btnCadastrar.setBounds(196, 181, 101, 23);
		contentPane.add(btnCadastrar);
	}
	/**
	 * Método para recuperar o botão
	 * @return btnEntrar
	 */
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	/**
	 * Métodos de recuperação do login
	 * @return textField
	 */
	public String getTextoUsuario() {
		return textField.getText();
	}
	/**
	 * Métodos de recuperação da senha
	 * @return passwordField
	 */
	public char[] getSenha() {
		return passwordField.getPassword();
		
	}
	/**
	 * Método para que descreve a ação na tela
	 * @param ouvinte
	 */
	public void adicionarOuvinte(ActionListener ouvinte) {
		btnEntrar.addActionListener(ouvinte);
		btnCadastrar.addActionListener(ouvinte);
	}
	
	/**
	 * Método para limpar os campos 
	 */
	public void Limpar() {
		textField.setText("");
		passwordField.setText("");
	}
}
