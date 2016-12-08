package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import dominio.Radar;
import dominio.Sistema;

public class IURadar extends JFrame implements Runnable{
	JPanel contentPane;
	JButton btnDisConnect;
	JTextArea JTxArea;
	Radar radar;
	Sistema sistema;
	Thread hiloRadar;
	
	public IURadar(Sistema sist) throws InterruptedException{
		sistema=sist;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btnDisConnect = new JButton("Parar Radar");
		JTxArea=new JTextArea("Radar Iniciado:\nBuscando conductores con prisa...");
		btnDisConnect.setBounds(15, 30, 117, 29);
		contentPane.add(btnDisConnect);
		
		JTxArea.setBounds(15,70,470,300);
		contentPane.add(JTxArea);
		
		vigilar();

		// -- desconectar
		btnDisConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pararRadar();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	
	public void pararRadar() throws InterruptedException {
		radar.parar();
		dispose();
		System.out.println("Desconectado el radar");
	}
	public void vigilar(){
		hiloRadar = new Thread(this);
		hiloRadar.start();
	}

	@Override
	public void run() {
		try {
			radar = new Radar(this.sistema, JTxArea);
			radar.vigilar();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
