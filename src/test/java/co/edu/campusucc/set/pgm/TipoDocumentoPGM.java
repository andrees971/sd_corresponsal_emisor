package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.TipoDocumentoDAO;
import co.edu.campusucc.sd.modelo.TipoDocumento;

public class TipoDocumentoPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento tpDocument = new TipoDocumento();
		
		tpDocument.setIdTipoDocumento("01");
		tpDocument.setNombreDocumento("Cedula");

		try {
			 dao.delete(tpDocument);
			// dao.persist(tpDocument);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
