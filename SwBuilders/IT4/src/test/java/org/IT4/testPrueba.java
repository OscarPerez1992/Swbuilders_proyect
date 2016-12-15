package org.IT4;

import org.junit.Test;

import dominio.Manager;
import dominio.Sanction;
import junit.framework.TestCase;

public class testPrueba extends TestCase {
	
	//Por testear: no resta los puntos!
	
	
	/*@Test
	public void test140_120() {
		Manager m=Manager.get();
		int idExpediente=m.openInquiry("0001", 140, "La ronda", 120);
		Sanction multa=m.identifyDriver(idExpediente, "5000002");
		m.pay(multa);
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount()==100);
		assertTrue(multa.getPoints()==0);
	}*/
	
	@Test
	public void test160_120() {
		Manager m=Manager.get();
		int idExpediente=m.openInquiry("0001", 160, "La ronda", 120);
		Sanction multa=m.identifyDriver(idExpediente, "5000002");
		//m.pay(multa);
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount()==300);
		assertTrue(multa.getPoints()==2);
	}

}
