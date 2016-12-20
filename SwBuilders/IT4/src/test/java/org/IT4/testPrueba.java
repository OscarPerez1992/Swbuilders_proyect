package org.IT4;
//
import org.junit.Test;

import dominio.Manager;
import dominio.Sanction;
import junit.framework.TestCase;

public class testPrueba extends TestCase {
/**
 * LIMITE 30- GENERA INQUIRY Y SANCTION
 */
 //
	@Test
	public void test31_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 31, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test40_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 40, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test50_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 50, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}

	@Test
	public void test51_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 51, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test55_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 55, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test60_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test61_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test65_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 65, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test70_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test71_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test75_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test80_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test81_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test90_30() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 30);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	/**
	 * LIMITE 40- GENERA INQUIRY Y SANCTION
	 */
	@Test
	public void test41_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 41, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test50_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 50, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test60_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test61_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test65_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 65, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test70_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test71_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test75_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test80_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test81_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test85_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test90_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test91_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test95_40() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 95, "La ronda", 40);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}

	
	/**
	 * LIMITE 50- GENERA INQUIRY Y SANCTION
	 */
	@Test
	public void test51_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 51, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test60_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 60, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test70_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 70, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}

	@Test
	public void test71_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test75_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 75, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test80_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test81_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test85_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 85, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test90_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test91_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test95_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 95, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test100_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test101_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test110_50() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 50);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	/**
	 * LIMITE 60- GENERA INQUIRY Y SANCTION
	 */
	@Test
	public void test61_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 61, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test80_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test90_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}

	@Test
	public void test91_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test100_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test110_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test111_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test115_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 115, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test120_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test121_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test125_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 125, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test130_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test131_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}	
	
	@Test
	public void test140_60() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 60);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}

	/**
	 * LIMITE 70- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test71_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 71, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test80_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 80, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test100_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 100, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}

	@Test
	public void test101_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test110_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test120_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test121_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test125_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 125, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test130_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test131_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test135_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test140_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test141_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test150_70() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 70);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	/**
	 * LIMITE 80- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test81_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 81, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	} 
	@Test
	public void test90_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 90, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test110_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test111_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test120_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test130_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	} 
	@Test
	public void test131_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	} 
	
	@Test
	public void test135_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 135, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	} 

	@Test
	public void test140_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	@Test
	public void test141_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	@Test
	public void test145_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	@Test
	public void test150_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test151_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	@Test
	public void test160_80() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 80);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	/**
	 * LIMITE 90- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test91_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 91, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test110_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test120_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test121_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	

	@Test
	public void test130_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	
	@Test
	public void test140_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test141_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test145_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 145, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test150_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	@Test
	public void test151_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	@Test
	public void test155_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	@Test
	public void test160_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	@Test
	public void test161_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	@Test
	public void test170_90() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 90);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	
	/**
	 * LIMITE 100- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test101_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 101, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	
	@Test
	public void test110_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 110, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test130_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 130, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test131_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 131, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test140_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	@Test
	public void test150_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test151_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test155_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 155, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	@Test
	public void test160_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test161_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test165_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	@Test
	public void test170_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test171_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	@Test
	public void test180_100() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La ronda", 100);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	
	/**
	 * LIMITE 110- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test111_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 111, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test120_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 120, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test140_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}

	@Test
	public void test141_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 141, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test150_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test160_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test161_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 161, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test165_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 165, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test170_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test171_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test175_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test180_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test181_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 181, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test190_110() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 190, "La ronda", 110);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	/**
	 * LIMITE 120- GENERA INQUIRY Y SANCTION
	 */	
	@Test
	public void test121_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 121, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test140_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 140, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}
	
	@Test
	public void test150_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 150, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 100);
		assertTrue(multa.getPoints() == 0);
	}

	@Test
	public void test151_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 151, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test160_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 160, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}
	
	@Test
	public void test170_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 170, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 300);
		assertTrue(multa.getPoints() == 2);
	}

	@Test
	public void test171_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 171, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test175_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 175, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}
	
	@Test
	public void test180_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 180, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 400);
		assertTrue(multa.getPoints() == 4);
	}

	@Test
	public void test181_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 181, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test185_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 185, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test190_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 190, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 500);
		assertTrue(multa.getPoints() == 6);
	}

	@Test
	public void test191_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 191, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}
	
	@Test
	public void test200_120() {
		Manager m = Manager.get();
		int idExpediente = m.openInquiry("0001", 200, "La ronda", 120);
		Sanction multa = m.identifyDriver(idExpediente, "5000002");
		multa.pay();
		assertNotNull(multa.getDateOfPayment());
		assertTrue(multa.getAmount() == 600);
		assertTrue(multa.getPoints() == 6);
	}

}
