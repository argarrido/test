package model.abonado;

import java.util.HashMap;
import java.util.Set;

import model.interfaces.IServicio;
import model.interfaces.MedioDePago;
import model.shared.Domicilio;
import model.shared.Factura;

public abstract class Abonado implements Cloneable {

	private String nombre;
	private String dni;
	protected HashMap<Domicilio, IServicio> contrataciones;

	/**
	 * <b>pre:</b><br>
	 * -dni debe ser distinto de null y el valor entero que le corresponde mayor a 0<br>
	 * -nombre debe ser distinto de null y no vacio<br>
	 * <b>post:</b> crea un nuevo Abonado
	 */
	public Abonado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.contrataciones = new HashMap<Domicilio, IServicio>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

	public HashMap<Domicilio, IServicio> getContrataciones() {
		return contrataciones;
	}

	/**
	 * Asigna un servicio al abonado asociado a un domicilio en particular.<br>
	 * Si ingresa un servicio asociado a un domicilio que ya existe lo sobrescribe
	 * 
	 * @param domicilio != null
	 * @param servicio
	 * 
	 */
	public void contratarServicio(Domicilio domicilio, IServicio servicio) {
		this.contrataciones.put(domicilio, servicio);
	}

	/**
	 * Realiza un pago con o sin descuento de la factura dependiendo del medio de
	 * pago y el tipo de abonado.<br>
	 * Aplica double dispatch
	 * 
	 * @param medioDePago != null
	 * @param factura     != null
	 * @return el monto a pagar
	 * 
	 */
	public abstract double pago(MedioDePago medioDePago, Factura factura);

	@Override
	public Object clone() throws CloneNotSupportedException {
		Abonado abonadoClonado = null;
		try {
			abonadoClonado = (Abonado) super.clone();
			abonadoClonado.contrataciones = (HashMap<Domicilio, IServicio>) contrataciones.clone();
		} catch (CloneNotSupportedException e) {

		}
		return abonadoClonado;
	}

	@Override
	public String toString() {
		String respuesta = "Abonado [Nombre: " + nombre + ", DNI: " + dni + "]\nContrataciones:\n";
		Set<Domicilio> keys = this.contrataciones.keySet();
		for (Domicilio key : keys) {
			respuesta += key + ", Servicio = " + this.contrataciones.get(key) + "\n";
		}
		return respuesta;
	}
	
	
	/**
	 * Evalúa simplmente el dni para determinar el hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	/**
	 * Evalúa simplemente el dni para determinar la igualdad entre objetos del mismo tipo
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abonado other = (Abonado) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	

}
