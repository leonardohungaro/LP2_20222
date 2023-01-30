/**
 * Classe criada para representar o usuário.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro
 */

package Modelo;

public class Usuario {
	private String nome, cpf, login, senha;
	/**
	 * Construtor completo.
	 * @param nome	Nome do usuário
	 * @param cpf	Código de pessoa física do usuário
	 * @param login	Login criado pelo usuário no momento do cadastro
	 * @param senha	Senha do usuário
	 */
	public Usuario(String nome, String cpf, String login, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}
	
	/**
	 * Construtor vazio
	 */
	public Usuario() {
		
	}
	
	/**
	 * Método para obter o nome do usuário
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método para configurar o nome do usuário
	 * @param nome Nome do usuário
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Método para obter o CPF do usuário
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Método para configurar o CPF do usuário
	 * @param cpf Código de pessoa física do usuário
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Método para obter o Login do usuário
	 * @return login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Método para configurar o Login do usuário
	 * @param login Nome criado pelo usuário dentro do sistema
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Método para obter a senha  do usuário
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Método para configurar a senha do usuário
	 * @param senha Senha pessoal do usuário para acesso ao sistema
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * Método para validação do login e da senha para validar a entrada do usuário no sistema
	 * @param user	Login informado pelo usuário para login
	 * @param key	Senha informada pelo usuário para login
	 * @return
	 */
	public boolean userCadastrado(String user, String key) {
		return (this.login.equals(user) && this.senha.equals(key));
	}
}
