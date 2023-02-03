/**
 * View criada para representar as instituições.
 * Data de criação: 29/01/2023
 * @author Leonardo Hungaro e Ariel Benvindo
 */
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Instituicao;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class CadastroInstituicao extends JFrame {

	private JPanel contentPane;
	private JTextField textCodMec;
	private JTextField textNomeInst;
	private JTextField textAnoFund;
	private JTextField textCidade;
	public JSeparator separator;
	public JScrollPane scrollPaneInstituicao;
	public JTable tableInstituicao;
	public DefaultTableModel modelo;
	private JButton btnCadastrarInst;
	private JButton btnLimparInst;
	private JComboBox comboBoxEst;
	private JComboBox comboBoxTipoInst;
	public Instituicao instituicao = new Instituicao();
	public ArrayList<Instituicao> instituicoes = new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroInstituicao frame = new CadastroInstituicao();
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
	public CadastroInstituicao() {
		setTitle("CADASTRO DE INSTITUIÇÃO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodMec = new JLabel("Código MEC");
		lblCodMec.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodMec.setBounds(120, 24, 153, 14);
		contentPane.add(lblCodMec);
		
		textCodMec = new JTextField();
		textCodMec.setBounds(120, 44, 110, 20);
		contentPane.add(textCodMec);
		textCodMec.setColumns(10);
		
		JLabel lblNomeInst = new JLabel("Nome da Instituição");
		lblNomeInst.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeInst.setBounds(120, 69, 300, 20);
		contentPane.add(lblNomeInst);
		
		textNomeInst = new JTextField();
		textNomeInst.setColumns(10);
		textNomeInst.setBounds(120, 88, 400, 20);
		contentPane.add(textNomeInst);
		
		JLabel lblAnoDeFund = new JLabel("Ano de Fundação");
		lblAnoDeFund.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnoDeFund.setBounds(120, 119, 110, 20);
		contentPane.add(lblAnoDeFund);
		
		textAnoFund = new JTextField();
		textAnoFund.setColumns(4);
		textAnoFund.setBounds(120, 138, 50, 20);
		contentPane.add(textAnoFund);
		
		JLabel lblMunic = new JLabel("Município");
		lblMunic.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMunic.setBounds(245, 120, 90, 20);
		contentPane.add(lblMunic);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(243, 138, 100, 20);
		contentPane.add(textCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstado.setBounds(365, 120, 90, 20);
		contentPane.add(lblEstado);
		
		comboBoxEst = new JComboBox();
		comboBoxEst.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBoxEst.setMaximumRowCount(27);
		comboBoxEst.setBounds(365, 138, 50, 20);
		contentPane.add(comboBoxEst);
		
		JLabel lblTipDaInst = new JLabel("Tipo da Instituição");
		lblTipDaInst.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipDaInst.setBounds(120, 173, 150, 20);
		contentPane.add(lblTipDaInst);
		
		comboBoxTipoInst = new JComboBox();
		comboBoxTipoInst.setModel(new DefaultComboBoxModel(new String[] {"Educação Infantil", "Ensino Fundamental", "Ensino Médio", "Educação Infantil e Ensino Fundamental", "Educação Infantil, Ensino Fundamental e Ensino Médio", "Ensino Fundamental e Médio", "Ensino Superior"}));
		comboBoxTipoInst.setMaximumRowCount(7);
		comboBoxTipoInst.setBounds(120, 193, 400, 20);
		contentPane.add(comboBoxTipoInst);
		
		definirJTable();
		scrollPaneInstituicao = new JScrollPane(tableInstituicao);
		scrollPaneInstituicao.setBounds(20, 300, 614, 141);
		getContentPane().add(scrollPaneInstituicao);
		
		btnLimparInst = new JButton("LIMPAR");
		btnLimparInst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpar();
			}
		});
		btnLimparInst.setBounds(140, 234, 89, 23);
		contentPane.add(btnLimparInst);
		
		btnCadastrarInst = new JButton("CADASTRAR");
		btnCadastrarInst.setBounds(387, 234, 100, 23);
		contentPane.add(btnCadastrarInst);
		scrollPaneInstituicao.setVisible(false);
		
		
	}
	public JPanel getContentPane() {
		return contentPane;
	}
	
	/**
	 * Métodos de recuperação do código do MEC
	 * @return textCodMec
	 */
	public String getTextCodMec() {
		return textCodMec.getText();
	}
	/**
	 * Métodos de recuperação do nome da instituição
	 * @return textNomeInst
	 */
	public String getTextNomeInst() {
		return textNomeInst.getText();
	}
	/**
	 * Métodos de recuperação do ano de fundação
	 * @return textAnoFund
	 */
	public String getTextAnoFund() {
		return textAnoFund.getText();
	}
	/**
	 * Métodos de recuperação da cidade
	 * @return textCidade
	 */
	public String getTextCidade() {
		return textCidade.getText();
	}
	/**
	 * Métodos de recuperação do estado
	 * @return comboBoxEst
	 */
	public String getComboBoxEst() {
		return comboBoxEst.getSelectedItem().toString();
	}
	/**
	 * Métodos de recuperação do tipo de instituição
	 * @return comboBoxTipoInst
	 */
	public String getComboBoxTipoInst() {
		return comboBoxTipoInst.getSelectedItem().toString();
	}

	public JSeparator getSeparator() {
		return separator;
	}

	public JScrollPane getScrollPaneInstituicao() {
		return scrollPaneInstituicao;
	}

	public JTable getTableInstituicao() {
		return tableInstituicao;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}
	/**
	 * Métodos de recuperação do botão
	 * @return btnCadastrarInst
	 */
	public JButton getBtnCadastrarInst() {
		return btnCadastrarInst;
	}

	/**
	 * Método utitilizado pra impressão dos dados
	 */
	public void definirJTable() {
		modelo = new DefaultTableModel();
		modelo.addColumn("Código do MEC");
		modelo.addColumn("Instituição");
		modelo.addColumn("Ano");
		modelo.addColumn("Estado");
		modelo.addColumn("Cidade");
		modelo.addColumn("Tipo");
		tableInstituicao = new JTable(modelo);
	}
	
	/**
	 * Método para que descreve a ação na tela
	 * @param ouvinte
	 */
	public void adicionarOuvinte(ActionListener ouvinte) {
		btnCadastrarInst.addActionListener(ouvinte);
	}
	
	/**
	 * Método para limpar os campos 
	 */
	public void Limpar() {
		textCodMec.setText("");
		textNomeInst.setText("");
		textAnoFund.setText("");
		textCidade.setText("");
	}
	
}