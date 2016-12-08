package presentacion;

import java.awt.Dimension;
import java.awt.EventQueue;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Radar;
import dominio.Sistema;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class IUUsuario extends JFrame{
	private Thread HiloRadar;
	private JPanel contentPane;
	private JButton btnSalir;
	private JButton btnConnect;
	private JButton btnSancionar;
	private JButton btnPagar;
	private static Sistema sistema;
	private static IUUsuario frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {  
				try {
					frame = new IUUsuario("Sistema Radar");
					frame.setVisible(true);				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public IUUsuario(String titulo) {		
		sistema = new Sistema();	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(560, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btnConnect = new JButton("Iniciar Radar");
		btnSalir = new JButton("Salir");
		btnPagar = new JButton("Pagar multa");

		btnSancionar = new JButton("Sancionar conductor");


		// -- iniciar radar
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					IURadar iuradar = new IURadar(sistema);
					iuradar.setVisible(true);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConnect.setBounds(15, 10, 117, 29);
		contentPane.add(btnConnect);

		// -- salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnSalir.setBounds(268, 400, 117, 29);
		contentPane.add(btnSalir);
		
		// --- sancionar conductor
		
		btnSancionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IUsancionar IUsancionar= new IUsancionar(sistema);
			}
		});
		btnSancionar.setBounds(155, 10, 200, 29);
		contentPane.add(btnSancionar);
		
		// --- pagar multa
		
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IUpagarSancion IUsacion = new IUpagarSancion(sistema);
			}
		});
		btnPagar.setBounds(155, 40, 200, 29);
		contentPane.add(btnPagar);
		
	}

	public void salir() {
		System.out.println("Cerrando sistema...");
		System.exit(0);
	}
}
