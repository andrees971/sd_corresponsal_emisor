package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.ClienteDAO;
import co.edu.campusucc.sd.modelo.Cliente;
import co.edu.campusucc.sd.modelo.TipoCliente;
import co.edu.campusucc.sd.modelo.TipoDocumento;

public class ClientePGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteDAO dao = new ClienteDAO();
		Cliente client = new Cliente();
		TipoDocumento tpDocument = new TipoDocumento();
		TipoCliente tpClient = new TipoCliente();
		
		tpDocument.setIdTipoDocumento("01");
		tpClient.setIdTipoCliente("001");
		

		client.setIdCliente("1000");
		client.setTipoDocumento(tpDocument);
		client.setTipoCliente(tpClient);
		client.setNombres("Jorge");
		client.setApellidos("Gomez");
		client.setRazonSocial("natural");
		

		try {
			// dao.delete(client);
			 dao.persist(client);
			//dao.consultar("1000");
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}
	}

}
