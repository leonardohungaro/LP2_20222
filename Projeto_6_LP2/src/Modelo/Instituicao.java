/**
 * Classe criada para representar as instituições.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro
 */

package Modelo;

public class Instituicao {
	private String nomeInstituicao, tipo, cidade, estado;
	private int codigoMec, anoFundacaoInstituicao;
	
	/**
	 * 
	 * @param nomeInstituicao
	 * @param tipo
	 * @param cidade
	 * @param estado
	 * @param codigoMec
	 * @param anoFundacaoInstituicao
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
	 * 
	 */
	public Instituicao() {
		
	}

	/**
	 * 
	 * @return
	 */
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	
	/**
	 * 
	 * @param nomeInstituicao
	 */
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	/**
	 * 
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @return
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * 
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return
	 */
	public int getCodigoMec() {
		return codigoMec;
	}

	/**
	 * 
	 * @param codigoMec
	 */
	public void setCodigoMec(int codigoMec) {
		this.codigoMec = codigoMec;
	}

	/**
	 * 
	 * @return
	 */
	public int getAnoFundacaoInstituicao() {
		return anoFundacaoInstituicao;
	}

	/**
	 * 
	 * @param anoFundacaoInstituicao
	 */
	public void setAnoFundacaoInstituicao(int anoFundacaoInstituicao) {
		this.anoFundacaoInstituicao = anoFundacaoInstituicao;
	}
}
