package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.UbicacionDAO;
import co.edu.campusucc.sd.modelo.Ubicacion;

class UbicacionTest {

	@Test
	final void testPersist() {
		UbicacionDAO dao = new UbicacionDAO();
		Ubicacion ubic = new Ubicacion();
		
		ubic.setIdUbicacion("12312");
		ubic.setNombre("colombia");
		
		try {
			dao.persist(ubic);
			assertTrue(true);
		} catch (Exception e) {
			fail(e.toString()); // TODO
		}
	
	}

}
