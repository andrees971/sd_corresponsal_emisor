package co.edu.campusucc.sd.micro.girossender.services;

import org.springframework.stereotype.Component;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;

@Component
public class GirosSenderImpl implements GirosSender {

	@Override
	public Pais crearPais(String idPais, String nombre, String gentilicio) {
		PaisDAO dao = new PaisDAO();
		Pais pais = new Pais();

		pais.setIdPais(idPais);
		pais.setNombre(nombre);
		pais.setGentilicio(gentilicio);

		try {
			dao.persist(pais);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

		return pais;
	}
	
	@Override
	public Pais consultarPais(String idPaisC) {
		PaisDAO dao = new PaisDAO();
		Pais pais = new Pais();

		try {
			pais = dao.consultar(idPaisC);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

		return pais;
		
	}

}
