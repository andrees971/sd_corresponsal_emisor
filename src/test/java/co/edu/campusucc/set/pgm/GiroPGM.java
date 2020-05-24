package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.GiroDAO;
import co.edu.campusucc.sd.modelo.Cliente;
import co.edu.campusucc.sd.modelo.Giro;
import co.edu.campusucc.sd.modelo.Pais;

public class GiroPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiroDAO dao=new GiroDAO();
		Giro giro= new Giro();
		Cliente client = new Cliente();
		Pais pais = new Pais();
		
		client.setIdCliente("1000");
		pais.setIdPais("CO");
		
		giro.setIdGiro("100");
		giro.setPaisOrigen("Francia");
		giro.setPaisLlegada("Colombia");
		giro.setCliente(client);
		giro.setValorEnvio(800000);
		giro.setComision(2.5);
		giro.setPais(pais);
		
		
		try {
			//dao.delete(giro);
			dao.persist(giro);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
