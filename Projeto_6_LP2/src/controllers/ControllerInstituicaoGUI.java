/**
 * Controller criado para representar as instituições.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro e Ariel Benvindo
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import view.CadastroInstituicao;


public class ControllerInstituicaoGUI {

	private CadastroInstituicao inicial;
	/**
	 * Método que identifica a ação do usuário
	 * @param inicial
	 */
	public ControllerInstituicaoGUI(CadastroInstituicao inicial) {
		this.inicial = inicial;
		Handler ouvinte = new Handler();
		inicial.adicionarOuvinte(ouvinte);
		
	}
	/**
	 * Método que avalia as informações passadas pelo usuário para realizar o cadastro
	 */
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == inicial.getBtnCadastrarInst()) {
				String mec = inicial.getTextCodMec();
				String instituicao = inicial.getTextNomeInst();
				String ano = inicial.getTextAnoFund();
				String cidade = inicial.getTextCidade();
				String estado = inicial.getComboBoxEst();
				String tipo = inicial.getComboBoxTipoInst();
				if(mec.equals("")) {
					JOptionPane.showMessageDialog(inicial.getContentPane(), "Preencha o campo Código do mec!", "Atenção",2);
				}else {
					inicial.instituicao.setCodigoMec((Integer.parseInt(mec)));;
					if(instituicao.equals("")) {
						JOptionPane.showMessageDialog(inicial.getContentPane(), "Preencha o campo instituição!", "Atenção",2);
					}else {
						inicial.instituicao.setNomeInstituicao(instituicao);
						if(ano.equals("")) {
							JOptionPane.showMessageDialog(inicial.getContentPane(), "Preencha o campo ano!", "Atenção",2);
						}else {
							inicial.instituicao.setAnoFundacaoInstituicao(Integer.parseInt(ano));
							if(cidade.equals("")) {
								JOptionPane.showMessageDialog(inicial.getContentPane(), "Preencha o campo cidade!", "Atenção",2);
							}else {
								inicial.instituicao.setCidade(cidade);
								if(estado.equals("")) {
									JOptionPane.showMessageDialog(inicial.getContentPane(), "Selecione um estado!", "Atenção",2);
								}else {
									inicial.instituicao.setTipo(tipo);
									if(tipo.equals("")) {
										JOptionPane.showMessageDialog(inicial.getContentPane(), "Selecione um tipo!", "Atenção",2);
									}else {
										inicial.instituicoes.add(inicial.instituicao);
										adicionarDados(mec, instituicao,ano,estado,cidade,tipo);
										JOptionPane.showMessageDialog(inicial.getContentPane(), "Cadastro efetuado com sucesso!", "Sucesso",1);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Método que gera a lista de instituições cadastradas
	 * @param mec
	 * @param instituicao
	 * @param ano
	 * @param estado
	 * @param cidade
	 * @param tipo
	 */
	public void adicionarDados(String mec, String instituicao, String ano, String estado, String cidade, String tipo) {
		Object[] dados = {mec, instituicao, ano, estado, cidade, tipo};
		inicial.modelo.addRow(dados);
		if(!inicial.scrollPaneInstituicao.isVisible()){
			inicial.scrollPaneInstituicao.setVisible(true);
		}
	}
}
