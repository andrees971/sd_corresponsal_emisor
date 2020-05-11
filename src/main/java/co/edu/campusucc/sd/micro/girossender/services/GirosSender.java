package co.edu.campusucc.sd.micro.girossender.services;

import co.edu.campusucc.sd.modelo.Pais;

public interface GirosSender {
	
	Pais crearPais(String idPais, String nombre, String gentilicio);
	Pais consultarPais(String idPais);

}
