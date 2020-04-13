package co.edu.campusucc.set.pgm;

import co.edu.campusucc.sd.daos.FormaPagoDAO;
import co.edu.campusucc.sd.modelo.FormaPago;

public class FormaPagoPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FormaPagoDAO dao = new FormaPagoDAO();
		FormaPago fPago = new FormaPago();
		
		fPago.setIdFormaPago("01");
		fPago.setNombre("efectivo");
		try {
			dao.delete(fPago);
			//dao.persist(fPago);
			System.out.println("ok");
		} catch (Exception e) {

			System.out.println(e.toString()); // TODO
		}

	}

}
