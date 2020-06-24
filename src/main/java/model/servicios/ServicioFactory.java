package model.servicios;

import model.excepciones.ServicioInvalidoException;
import model.interfaces.IServicio;

public class ServicioFactory {

	/**
	 * Factory method de un IServicio
	 * 
	 * @param servicio  <i>String</i> Define el tipo de servicio. Debe ser distinto
	 *                  de null
	 * @param celular:  <i>boolean</i> Agrega servicio de Celular
	 * @param telefono: <i>boolean</i> Agrega servicio de Telefono
	 * @param tv_cable: <i>boolean</i> Agrega servicio de TV_Cable
	 * @return una instancia del tipo IServicio
	 * @throws ServicioInvalidoException arroja en caso de que se ingrese un
	 *                                   servicio inexistente
	 */
	public static IServicio getServicio(String servicio, boolean celular, boolean telefono, boolean tv_cable)
			throws ServicioInvalidoException {
		IServicio encapsulado = null;

		if (servicio.equalsIgnoreCase("Internet100"))
			encapsulado = new Internet100();
		else if (servicio.equalsIgnoreCase("Internet500"))
			encapsulado = new Internet500();

		if (encapsulado != null) {
			if (celular)
				encapsulado = new Celular(encapsulado);
			if (telefono)
				encapsulado = new Telefono(encapsulado);
			if (tv_cable)
				encapsulado = new TV_Cable(encapsulado);
		} else
			throw new ServicioInvalidoException("Servicio seleccionado es incorrecto o no existe");

		return encapsulado;
	}
}
