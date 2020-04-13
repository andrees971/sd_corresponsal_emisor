package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.BiometriaDAO;
import co.edu.campusucc.sd.modelo.Biometria;

class BiometriaTest {

	@Test
	final void testPersist() {
		BiometriaDAO dao = new BiometriaDAO();
		Biometria biomt = new Biometria();
		
		try {
			dao.persist(biomt);
			assertTrue(true);
		} catch (Exception e) {
			
			fail(e.toString()); // TODO
		}
	}

}
