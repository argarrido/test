package model.servicios;

import model.interfaces.IServicio;

public class Celular extends ServicioDecorator {

	public Celular(IServicio encapsulado) {
		super(encapsulado);
	}

	@Override
	public String getDescripcion() {
		return this.encapsulado.getDescripcion() + " + servicio de Celular";
	}

	@Override
	public double getValor() {
		return this.encapsulado.getValor() + 300;
	}

	@Override
	public String toString() {
		return "[Detalle: " + getDescripcion() + ", Precio: $" + getValor() + "]";
	}

}
