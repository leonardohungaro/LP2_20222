/**
 * Classe criada para representar as instituições.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro e Ariel Benvindo
 */

package modelo;

public class Instituicao {
	private String nomeInstituicao, tipo, cidade, estado;
	private int codigoMec, anoFundacaoInstituicao;
	
	/**
	 * Contrutor completo
	 * @param nomeInstituicao		Nome da isntituição de ensino
	 * @param tipo				Tipo da instituição de ensino(Educação Infantil, Ensino médio, Ensino fundamental, Ensino superior)
	 * @param cidade			Município em que se localiza a instituição
	 * @param estado			Estado em que se localiza a instituição
	 * @param codigoMec			Código de cadastro da instituição no MEC
	 * @param anoFundacaoInstituicao	Ano de fundação da instituição.
	 */
	public Instituicao(String nomeInstituicao, String tipo, String cidade, String estado, int codigoMec, int anoFundacaoInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
		this.tipo = tipo;
		this.cidade = cidade;
		this.estado = estado;
		this.codigoMec = codigoMec;
		this.anoFundacaoInstituicao = anoFundacaoInstituicao;
	}
	
	/**
	 * Construtor vazio
	 */
	public Instituicao() {
		
	}

	/**
	 * Método que retorna o nome da instituição
	 * @return nomeInstituicao
	 */
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	
	/**
	 * Método para configurar o nome da instituição
	 * @param nomeInstituicao
	 */
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	/**
	 * Método que retorna o tipo da instituição
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para configurar o tipo da instituição
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método que retorna o município em que se localiza a instituição
	 * @return cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Método para configurar o município em que se localiza a instituição
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Método que retorna o estado em que se localiza a instituição
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Método para configurar o estado em que se localiza a instituição
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Método que retorna o código de cadastro da instituição no MEC
	 * @return codigoMec
	 */
	public int getCodigoMec() {
		return codigoMec;
	}

	/**
	 * Método para configurar o código de cadastro da instituição no MEC
	 * @param codigoMec
	 */
	public void setCodigoMec(int codigoMec) {
		this.codigoMec = codigoMec;
	}

	/**
	 * Método que retorna o ano de fundação da instituição
	 * @return anoFundacaoInstituicao
	 */
	public int getAnoFundacaoInstituicao() {
		return anoFundacaoInstituicao;
	}

	/**
	 * Método para configurar o ano de fundação da instituição
	 * @param anoFundacaoInstituicao
	 */
	public void setAnoFundacaoInstituicao(int anoFundacaoInstituicao) {
		this.anoFundacaoInstituicao = anoFundacaoInstituicao;
	}
}