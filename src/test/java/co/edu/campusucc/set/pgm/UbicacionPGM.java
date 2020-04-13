package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.UbicacionDAO;
import co.edu.campusucc.sd.modelo.Ubicacion;

public class UbicacionPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UbicacionDAO dao = new UbicacionDAO();
		Ubicacion ubica = new Ubicacion();

		//ubica.setIdUbicacion("0101");
		//ubica.setNombre("peru");

		try {
			 ubica = dao.findById("0100");
			 dao.delete(ubica);
			// dao.persist(ubica);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
