package presentacion;

import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dominio.Sistema;

public class IUsancionar extends JFrame{
	JPanel contentPane;	
	JButton btnCancelar;
	JButton btnSancionar;
	JTextField IDincidencia;
	JTextField dni;
	JLabel lblid;
	JLabel lbldni;
	IUsancionar frame;
	
	public IUsancionar(Sistema sistema) {		
		try {
			frame = new IUsancionar("Sancionar", sistema);
			frame.setVisible(true);
	
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public IUsancionar(String titulo, Sistema sistema) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btnCancelar = new JButton("Cancelar");
		btnSancionar= new JButton("Sancionar");
		IDincidencia = new JTextField();
		dni = new JTextField();
		lblid= new JLabel("Id indicencia:");
		lbldni= new JLabel("Dni:");
		
		//textbox para la id de la incidencia
		lblid.setBounds(80, 20, 150, 35);
		contentPane.add(lblid);
		IDincidencia.setBounds(170, 20, 150, 29);
		contentPane.add(IDincidencia);
		
		//textbox para el dni
		lbldni.setBounds(80, 50, 150, 29);
		contentPane.add(lbldni);
		dni.setBounds(170, 50, 150, 29);
		contentPane.add(dni);
		
		// -- aceptar
		btnSancionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!IDincidencia.getText().equals("") && !dni.getText().equals("") ) 
					sistema.sancionar(Integer.parseInt(IDincidencia.getText()), dni.getText());
					dispose();
			}
		});
		btnSancionar.setBounds(250, 120, 117, 29);
		contentPane.add(btnSancionar);
		
		// -- cancelar
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		btnCancelar.setBounds(120, 120, 117, 29);
		contentPane.add(btnCancelar);
		
	}
	
	public void cerrar(){
		dispose();
		
	}
}
