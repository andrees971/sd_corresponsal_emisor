package co.edu.campusucc.sd.micro.girossender.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.campusucc.sd.micro.girossender.services.GirosSender;
import co.edu.campusucc.sd.micro.girossender.services.GirosSenderImpl;
import co.edu.campusucc.sd.modelo.Pais;


@RestController
public class GirosSenderController {
	
	@Autowired
	private GirosSender girosSender;
	
	@GetMapping("/crearpais/idpais/{idPais}/nom/{nombre}/gent/{gentilicio}")
	public Pais crearPais(@PathVariable String idPais, @PathVariable String nombre, @PathVariable String gentilicio) {
		
		return girosSender.crearPais(idPais, nombre, gentilicio);	
	}
	
	@GetMapping("/consultarpais/idpaisc/{idPaisC}")
	public Pais consultarPais(@PathVariable String idPaisC) {
		return girosSender.consultarPais(idPaisC);
	}
}
