package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.TipoClienteDAO;
import co.edu.campusucc.sd.daos.TipoDocumentoDAO;
import co.edu.campusucc.sd.modelo.TipoDocumento;

class TipoDocumentoTest {

	@Test
	final void testPersist() {
		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento td = new TipoDocumento();
		
		td.setIdTipoDocumento("1321");
		td.setNombreDocumento("CC");
		
		try {
			dao.persist(td);
			assertTrue(true);
		} catch (Exception e) {
			
			fail(e.toString()); // TODO
		}
	}

}
