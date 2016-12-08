package presentacion;

import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dominio.Sistema;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class IUpagarSancion extends JFrame {
	JPanel contentPane;	
	JButton btnCancelar;
	JButton btnAceptar;
	JTextField IDsancion;
	JLabel lblid;
	IUpagarSancion frame;
	
	public IUpagarSancion(Sistema sistema) {		
		try {
			frame = new IUpagarSancion("Pagar sanción", sistema);
			frame.setVisible(true);
	
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public IUpagarSancion(String titulo, Sistema sistema) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(250, 150, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btnCancelar = new JButton("Cancelar");
		btnAceptar = new JButton("Aceptar");
		IDsancion = new JTextField();
		lblid= new JLabel("Id sancion:");
		
		//textbox para la id de la sancion
		lblid.setBounds(80, 20, 150, 29);
		contentPane.add(lblid);
		
		IDsancion.setBounds(150, 20, 150, 29);
		contentPane.add(IDsancion);
		
		// -- aceptar
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!IDsancion.getText().equals(""))
					sistema.pagarSancion(Integer.parseInt(IDsancion.getText()));
					dispose();
			}
		});
		btnAceptar.setBounds(250, 120, 117, 29);
		contentPane.add(btnAceptar);
		
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
