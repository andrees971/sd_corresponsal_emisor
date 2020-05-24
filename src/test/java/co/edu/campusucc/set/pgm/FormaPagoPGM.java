package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.FormaPagoDAO;
import co.edu.campusucc.sd.modelo.FormaPago;
import co.edu.campusucc.sd.modelo.Giro;

public class FormaPagoPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FormaPagoDAO dao = new FormaPagoDAO();
		FormaPago fPago = new FormaPago();
		Giro giro = new Giro();
		
		giro.getIdGiro();
		
		fPago.setIdFormaPago("01");
		fPago.setNombre("efectivo");
		fPago.setGiro(giro);
		
		try {
			//dao.delete(fPago);
			dao.persist(fPago);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
