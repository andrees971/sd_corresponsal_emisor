package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.GiroDAO;
import co.edu.campusucc.sd.modelo.Giro;

public class GiroPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiroDAO dao=new GiroDAO();
		Giro giro= new Giro();
		
		giro.setIdGiro("100");
		
		
		try {
			//dao.delete(giro);
			//dao.persist(giro);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
