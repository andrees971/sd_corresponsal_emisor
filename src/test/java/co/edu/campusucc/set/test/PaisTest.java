package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;

class PaisTest {

	@Test
	final void testPersist() {
		PaisDAO dao = new PaisDAO();
		Pais pais= new Pais();
		
		pais.setIdPais("CO");
		pais.setNombre("colombia");
		pais.setGentilicio("colombiano");
		
	
		try {
			dao.persist(pais);
			assertTrue(true);
		} catch (Exception e) {
			
		fail(e.toString()); // TODO
		}
	}

}
