package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.TipoClienteDAO;
import co.edu.campusucc.sd.modelo.TipoCliente;

public class TipoClientePGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TipoClienteDAO dao = new TipoClienteDAO();
		TipoCliente tpClient = new TipoCliente();
		
		tpClient.setIdTipoCliente("002");
		tpClient.setNombre("juridico");

		try {
			// dao.delete(tpClient);
			 dao.persist(tpClient);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
