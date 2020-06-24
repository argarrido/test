package model.abonado;

import model.interfaces.MedioDePago;
import model.shared.Factura;

public class PersonaJuridica extends Abonado {

	public PersonaJuridica(String nombre, String dni) {
		super(nombre, dni);
	}

	@Override
	public double pago(MedioDePago medioDePago, Factura factura) {
		return medioDePago.personaJuridica(factura);
	}

	/**
	 * Este metodo arrojara siempre la excepcion CloneNotSupportedException porque
	 * una PersonaJuridica no se puede clonar.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("No se puede clonar una Persona Juridica");
	}

}
