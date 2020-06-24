package model.servicios;

import model.interfaces.IServicio;

public class Telefono extends ServicioDecorator {

	@Override
	public String toString() {
		return "[Detalle: " + getDescripcion() + ", Precio: $" + getValor() + "]";
	}

	public Telefono(IServicio encapsulado) {
		super(encapsulado);
	}

	@Override
	public String getDescripcion() {
		return this.encapsulado.getDescripcion() + " + servicio de Telefono";
	}

	@Override
	public double getValor() {
		return this.encapsulado.getValor() + 200;
	}

}
