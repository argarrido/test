package model.shared;

public class Domicilio implements Cloneable {

	private String calle;
	private String numero;

	/**
	 * <b>pre:</b><br>
	 * -calle debe ser distinto de null y no vacio<br>
	 * -numero debe ser distinto de null y el valor entero que le corresponde
	 * mayor a 0<br>
	 * <b>post:</b> crea un nuevo Domicilio
	 */
	public Domicilio(String calle, String numero) {
		this.calle = calle;
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	// Cuando dos objetos son exactamente iguales devuelve siempre el mismo hash
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio other = (Domicilio) obj;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public Object clone() {
		Object r = null;
		try {
			r = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return r;
	}

	@Override
	public String toString() {
		return "Domicilio [Calle: " + calle + ", Numero: " + numero + "]";
	}

}
