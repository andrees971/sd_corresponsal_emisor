package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.GiroDAO;
import co.edu.campusucc.sd.modelo.Giro;

class GiroTest {

	@Test
	final void testPersist() {
		GiroDAO dao = new GiroDAO();
		Giro giro = new Giro();
		
		giro.setIdGiro("1");
		
		try {
			dao.persist(giro);
			assertTrue(true);
		} catch (Exception e) {
			
			fail(e.toString()); // TODO
		}
	}

}
