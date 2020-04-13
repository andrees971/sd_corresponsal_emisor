package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.TipoClienteDAO;
import co.edu.campusucc.sd.modelo.TipoCliente;

class TipoClienteTest {

	@Test
	final void testPersist() {
		TipoClienteDAO dao = new TipoClienteDAO();
		TipoCliente tpc = new TipoCliente();
		
		tpc.setNombre("natural");
		tpc.setIdTipoCliente("1233124");
		
		try {
			dao.persist(tpc);
			assertTrue(true);
		} catch (Exception e) {
			fail(e.toString()); // TODO
		}
	}
}
