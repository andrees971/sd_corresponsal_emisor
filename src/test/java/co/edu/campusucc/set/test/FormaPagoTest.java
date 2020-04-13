package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.FormaPagoDAO;
import co.edu.campusucc.sd.modelo.FormaPago;

class FormaPagoTest {

	@Test
	final void testPersist() {
		FormaPagoDAO dao = new FormaPagoDAO();
		FormaPago fp = new FormaPago();
		
		fp.setIdFormaPago("1231");
		fp.setNombre("efectivo");
		
		try {
			dao.persist(fp);
			assertTrue(true);
		} catch (Exception e) {
			
			fail(e.toString()); // TODO
		}
	}

}
