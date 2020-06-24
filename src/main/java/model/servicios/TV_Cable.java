package model.servicios;

import model.interfaces.IServicio;

public class TV_Cable extends ServicioDecorator {

	public TV_Cable(IServicio encapsulado) {
		super(encapsulado);
	}

	@Override
	public String getDescripcion() {
		return this.encapsulado.getDescripcion() + " + servicio de TV-Cable";
	}

	@Override
	public double getValor() {
		return this.encapsulado.getValor() + 250;
	}

	@Override
	public String toString() {
		return "[Detalle: " + getDescripcion() + ", Precio: $" + getValor() + "]";
	}
}
