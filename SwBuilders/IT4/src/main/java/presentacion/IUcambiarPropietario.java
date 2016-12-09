package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dominio.Sistema;

public class IUcambiarPropietario extends JFrame{
	JPanel contentPane;	
	JButton btnCancelar;
	JButton btnCambiar;
	JTextField textLicencia;
	JLabel lbllicencia;
	JTextField textDni;
	JLabel lblDni;
	IUcambiarPropietario frame;
	
	public IUcambiarPropietario(Sistema sistema) {		
		try {
			frame = new IUcambiarPropietario("Pagar sanción", sistema);
			frame.setVisible(true);
	
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public IUcambiarPropietario(String titulo, Sistema sistema) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btnCancelar = new JButton("Cancelar");
		btnCambiar = new JButton("Cambiar");
		textLicencia = new JTextField();
		lbllicencia= new JLabel("Matricula vehiculo:");
		textDni = new JTextField();
		lblDni= new JLabel("Dni nuevo propietario:");
		
	
		
		lbllicencia.setBounds(80, 20, 150, 35);
		contentPane.add(lbllicencia);
		textLicencia.setBounds(230, 20, 150, 29);
		contentPane.add(textLicencia);
				
		//textbox para el dni
		lblDni.setBounds(80, 50, 150, 29);
		contentPane.add(lblDni);
		textDni.setBounds(230, 50, 150, 29);
		contentPane.add(textDni);
		
		// -- aceptar
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textLicencia.getText().equals("") && !textDni.getText().equals(""))
					sistema.cambiarPropietario(textLicencia.getText(),textDni.getText());
				dispose();
			}
		});
		btnCambiar.setBounds(250, 120, 117, 29);
		contentPane.add(btnCambiar);
		
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
