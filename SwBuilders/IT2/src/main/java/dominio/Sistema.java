package dominio;

public class Sistema {

	private Manager.ManagerHolder manager; 
	
	public Sistema(){
		manager = new Manager.ManagerHolder();			
	}
	
	public int abrirIncidencia(String license, double speed, String location, double maxSpeed){
		return manager.get().openInquiry(license, speed, location, maxSpeed);		
	}
	
	public void sancionar(int idInquiry, String dni){
		manager.get().identifyDriver(idInquiry, dni);	
	}


}
