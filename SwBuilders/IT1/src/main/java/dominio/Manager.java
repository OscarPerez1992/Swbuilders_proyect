package dominio;

import persistencia.GeneralDao;
import persistencia.OwnerDao;
import persistencia.VehicleDao;
 
/**
 * This class is the access point to the business logic.
 * @author macario.polo
 *  
 */
public class Manager {
	
	private Manager() {	}
	
	public static class ManagerHolder {
		public static Manager manager=new Manager();	
	
		/**
		 * 
		 * @return The only existing instance of the Manager
		 */
		public static Manager get() {
			return ManagerHolder.manager;
		}
	}
	
	/**
	 * Executed by {@link Manager} when a vehicle passes through the radar exceeding the speed limit
	 * @param license: license plate of the vehicle
	 * @param speed: speed of the vehicle
	 * @param location: location of the radar
	 * @param maxSpeed: max speed in the controlled point
	 */
	public int openInquiry(String license, double speed, String location, double maxSpeed) {
		Inquiry inquiry=new Inquiry(license, speed, location, maxSpeed);
		GeneralDao<Inquiry> dao=new GeneralDao<>();
		dao.insert(inquiry);
		return inquiry.getId();
	}
	

}
