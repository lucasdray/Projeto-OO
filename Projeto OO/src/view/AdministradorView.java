package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Administrador;

public class AdministradorView {

	private JFrame frame;


	/**
	 * Create the application.
	 * @param administrador 
	 */
	public AdministradorView(Administrador administrador) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JFrame getFrame() {
	    return frame;
	  }

}
