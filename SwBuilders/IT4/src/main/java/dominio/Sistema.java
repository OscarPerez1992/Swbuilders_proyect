package dominio;

public class Sistema {

	private Manager manager; 
	
	public Sistema(){
		manager =Manager.get();
		
	}
	
	public int abrirIncidencia(String license, double speed, String location, double maxSpeed){
		return manager.get().openInquiry(license, speed, location, maxSpeed);		
	}
	
	public Sanction sancionar(int idInquiry, String dni){
		return manager.get().identifyDriver(idInquiry, dni);	
	}
	
	public void pagarSancion(int idsancion){
		manager.get().pay(idsancion);	
	}
	
	public void cambiarPropietario(String license, String newDni){
		manager.get().changeOwner(license, newDni);
	}


}
