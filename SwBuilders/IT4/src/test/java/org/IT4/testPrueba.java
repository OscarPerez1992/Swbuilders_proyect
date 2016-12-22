package org.IT4;
//
import org.junit.Test;

import dominio.Manager;
import dominio.Owner;
import dominio.Radar;
import dominio.Sanction;
import dominio.Sistema;
import dominio.Vehicle;
import persistencia.DriverDao;
import dominio.Driver;
import persistencia.GeneralDao;
import persistencia.VehicleDao;
import dominio.Inquiry;
import junit.framework.TestCase;

public class testPrueba extends TestCase {
/**
 * LIMITE 30- GENERA INQUIRY Y SANCTION
 */
 //
	@Test
	public void test31_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>(); 

		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 31, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		//se identifica conductor (y restan puntos, que no lo hace y hay que solucionarlo en mantenimiento)
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();//paga la multa
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	
	}
	
	@Test
	public void test40_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 40, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test50_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 40, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test51_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 51, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test55_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 55, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test60_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());	
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test61_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test65_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 65, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test70_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test71_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test75_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test80_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test81_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test90_30() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 30);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	/**
	 * LIMITE 40- GENERA INQUIRY Y SANCTION
	 */
	@Test
	public void test41_40() {
		
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 41, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test50_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 50, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test60_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test61_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
			
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test65_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 65, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test70_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test71_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test75_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
			
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test80_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test81_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test85_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test90_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test91_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test95_40() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 95, "La ronda", 40);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	
	/**
	 * LIMITE 50- GENERA INQUIRY Y SANCTION
	 */
	@Test
	public void test51_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 51, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test60_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test70_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test71_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test75_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test80_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test81_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test85_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test90_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test91_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test95_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 95, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test100_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test101_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test110_50() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 50);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	/**
	 * LIMITE 60- GENERA INQUIRY Y SANCTION
	 */
	@Test
	public void test61_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test80_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test90_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test91_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test100_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test110_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test111_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test115_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 115, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test120_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test121_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test125_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 125, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test130_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test131_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}	
	
	@Test
	public void test140_60() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 60);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	/**
	 * LIMITE 70- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test71_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test80_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test100_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test101_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test110_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test120_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test121_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test125_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 125, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test130_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test131_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test135_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test140_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test141_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test150_70() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 70);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	/**
	 * LIMITE 80- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test81_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	} 
	@Test
	public void test90_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test110_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test111_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test120_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test130_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	} 
	@Test
	public void test131_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	} 
	
	@Test
	public void test135_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	} 

	@Test
	public void test140_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test141_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test145_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test150_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test151_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test160_80() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 80);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	/**
	 * LIMITE 90- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test91_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test110_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test120_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test121_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	

	@Test
	public void test130_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	
	@Test
	public void test140_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test141_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test145_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test150_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test151_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test155_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test160_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test161_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test170_90() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 90);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	
	/**
	 * LIMITE 100- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test101_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	
	@Test
	public void test110_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test130_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test131_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test140_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test150_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test151_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test155_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test160_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test161_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test165_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test170_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test171_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	@Test
	public void test180_100() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La ronda", 100);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	
	/**
	 * LIMITE 110- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test111_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test120_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test140_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test141_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test150_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test160_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test161_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test165_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test170_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test171_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test175_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test180_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test181_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 181, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test190_110() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 190, "La ronda", 110);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	/**
	 * LIMITE 120- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test121_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test140_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test150_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test151_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test160_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test170_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test171_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test175_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test180_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test181_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 181, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test185_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 185, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test190_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 190, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}

	@Test
	public void test191_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 191, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void test200_120() {
		GeneralDao <Inquiry>gdao=new GeneralDao<>();
		
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 200, "La ronda", 120);
		
		//comrpueba que existe
		Inquiry incidencia = gdao.findById(Inquiry.class, idExpediente);
		assertNotNull(incidencia);
		
		//obtiene los puntos del conductor para comprobar tras el indentifyDriver si los ha actualizado
		DriverDao driverDao = new DriverDao();
		Driver conductor = driverDao.findByDni("5000002");
		int puntos=conductor.getPoints();
		
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		//actualiza la multa en la bbdd
		m.pay(multa.getId());
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
		
		//Comprueba lo nuevos puntos del conductor
		conductor = driverDao.findByDni("5000002");
		int puntosActualizados=conductor.getPoints();
		assertTrue(puntos==puntosActualizados); //en caso de restarle puntos: assertTrue(puntos==(puntosActualizados-X))
	}
	
	@Test
	public void testChangeOwner() {
		Manager m = Manager.get();
		VehicleDao vDao= new VehicleDao();
		
		Vehicle vehicle=vDao.findByLicense("0000");
		String owner=vehicle.getOwner().getDni();
		
		m.changeOwner("0000", "5000003");
		
		vehicle=vDao.findByLicense("0000");
		assertNotNull(vehicle);
		String newOwner=vehicle.getOwner().getDni();	
		assertFalse(owner==newOwner);
		assertTrue(newOwner.equals("5000003"));
		
	}

	@Test 
	public void testSistema() throws InterruptedException{
		Sistema sistema= new Sistema();
		Radar radar = new Radar();
		Manager m = Manager.get();
		String matricula=radar.generarMatricula();
		
		int idExpediente =sistema.abrirIncidencia(matricula, 40, "Puertollano", 30);
		assertNotNull(idExpediente);
		Sanction multa=sistema.sancionar(idExpediente, "5000000");
		assertNotNull(multa);
		sistema.pagarSancion(multa.getId());
		
		sistema.cambiarPropietario("0000", "5000000");
		VehicleDao vDao= new VehicleDao();
		Vehicle vehicle=vDao.findByLicense("0000");
		assertTrue(vehicle.getOwner().getDni().equals("5000000"));		
		
	}
}
