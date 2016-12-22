package dominio;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextArea;


public class Radar { 
	
	private double velocidad;
	private double velocidadMaxima[] = { 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
	private String listaLoscalizacion[]={"Puertollano","Murcia","Ciudad Real","Albacete","Barcelona","Madrid","Cuenca","Sevilla","Guadalajara"};
	private double vMax;
	private String matricula;
	private String localizacion;
	private boolean funcionar;
	private Sistema sistema;
	private JTextArea area;
	
	public Radar(Sistema sistema,JTextArea JTa) throws InterruptedException {
		this.velocidad = 0;
		this.vMax = 0;
		this.matricula = "";
		this.localizacion ="";
		this.funcionar = true; 
		this.sistema=sistema;
		this.area=JTa;
	}
	
	public Radar(){
		
	}

	public void vigilar() throws InterruptedException {

		while (this.funcionar) {
			// genera los datos
			velocidad = (int) (Math.random() * (200 + 1));
			vMax = velocidadMaxima[(int) (Math.random() * velocidadMaxima.length)];
			matricula = generarMatricula();
			localizacion = listaLoscalizacion[(int) (Math.random() * listaLoscalizacion.length)];
			//System.out.println("Coche generado:: localizacion: " + localizacion + ". Matricula: " + matricula
			//		+ ". Velocidad: " + velocidad + ". Velocidad maxima permitida: " + vMax);

			// comprueba si supera la velocidad y de ser así manda al servidor
			if (vMax < velocidad)
				abrirIncidencia(matricula, velocidad, String.valueOf(localizacion), vMax);
			// pausa 2s
			TimeUnit.SECONDS.sleep(2);
		}

	}

	public static String generarMatricula() {		
		int matriculAleatoria=(int) (Math.random() * 3217);
		String matricula=String.valueOf(matriculAleatoria);
		
		if(matricula.length()==1)
			matricula="000"+matricula;
		else if (matricula.length()==2)
			matricula="00"+matricula;
		else if (matricula.length()==3)
			matricula="0"+matricula;
		
		return matricula;
	}
	
	public void parar(){
		this.funcionar=false;		
	}
	
	public void abrirIncidencia(String license, double speed, String location, double maxSpeed){
		int id= this.sistema.abrirIncidencia(license, speed, location, maxSpeed);
		area.setText(area.getText()+"\nCoche: " + matricula + " ha cometido una infracción con ID: "+id);
	}

}
