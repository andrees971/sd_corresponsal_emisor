package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.ClienteDAO;
import co.edu.campusucc.sd.modelo.Cliente;

public class ClientePGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteDAO dao = new ClienteDAO();
		Cliente client = new Cliente();

		client.setIdCliente("1000");

		try {
			// dao.delete(client);
			// dao.persist(client);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}
	}

}
