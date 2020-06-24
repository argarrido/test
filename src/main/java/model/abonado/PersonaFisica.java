package model.abonado;

import model.interfaces.MedioDePago;
import model.shared.Factura;

public class PersonaFisica extends Abonado {

	public PersonaFisica(String nombre, String dni) {
		super(nombre, dni);
	}

	@Override
	public double pago(MedioDePago medioDePago, Factura factura) {
		return medioDePago.personaFisica(factura);
	}

}
