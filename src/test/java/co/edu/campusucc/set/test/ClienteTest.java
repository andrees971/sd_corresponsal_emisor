package co.edu.campusucc.set.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.ClienteDAO;
import co.edu.campusucc.sd.modelo.Cliente;

class ClienteTest {

	@Test
	final void testPersist() {
		ClienteDAO dao= new ClienteDAO();
		Cliente client= new Cliente();
		
		client.setIdCliente("1231421");
		
		try {
			dao.persist(client);
			assertTrue(true);
		} catch (Exception e) {
			
			fail(e.toString()); // TODO
		}
	}

}
