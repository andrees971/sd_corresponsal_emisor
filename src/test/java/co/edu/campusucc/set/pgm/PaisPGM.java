package co.edu.campusucc.set.pgm;

import static org.junit.jupiter.api.Assertions.*;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;

class PaisPGM {

	public static void main(String[] args) {

		PaisDAO dao = new PaisDAO();
		Pais pais = new Pais();

//		pais.setIdPais("fr");
//		pais.setNombre("francia");
//		pais.setGentilicio("frances");
		

		try {
			//dao.persist(pais);
			//dao.delete(pais);
			pais= dao.consultar("CO");
			//dao.actualizar(pais);
			System.out.println(pais.getNombre());
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}
	}

}
