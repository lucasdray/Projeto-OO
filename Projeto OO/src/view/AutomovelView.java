package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AutomovelView {

	private JFrame frmTelaDeAutomoveis;


	/**
	 * Create the application.
	 */
	public AutomovelView() {
		frmTelaDeAutomoveis = new JFrame();
		frmTelaDeAutomoveis.setTitle("TELA DE AUTOMOVEIS");
		frmTelaDeAutomoveis.setBounds(100, 100, 551, 373);
		frmTelaDeAutomoveis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeAutomoveis.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTelaDeAutomoveis.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{115, 115, 129, 0};
		gbl_panel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnCriarAuto = new JButton("Cadastrar Automóvel");
		GridBagConstraints gbc_btnCriarAuto = new GridBagConstraints();
		gbc_btnCriarAuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCriarAuto.anchor = GridBagConstraints.NORTH;
		gbc_btnCriarAuto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCriarAuto.gridx = 1;
		gbc_btnCriarAuto.gridy = 3;
		panel.add(btnCriarAuto, gbc_btnCriarAuto);
		
		JButton btnBuscarAuto = new JButton("Visualizar Automóveis");
		GridBagConstraints gbc_btnBuscarAuto = new GridBagConstraints();
		gbc_btnBuscarAuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscarAuto.anchor = GridBagConstraints.NORTH;
		gbc_btnBuscarAuto.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarAuto.gridx = 1;
		gbc_btnBuscarAuto.gridy = 5;
		panel.add(btnBuscarAuto, gbc_btnBuscarAuto);
		btnBuscarAuto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ListarAutomoveis().setVisible(true);
				
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVoltar.insets = new Insets(0, 0, 0, 5);
		gbc_btnVoltar.gridx = 1;
		gbc_btnVoltar.gridy = 7;
		panel.add(btnVoltar, gbc_btnVoltar);
		
		
	}


	public JFrame getFrame() {
		return frmTelaDeAutomoveis;
	}


	public void setFrame(JFrame frame) {
		this.frmTelaDeAutomoveis = frame;
	}


}
