package model.servicios;

import model.interfaces.IServicio;

public abstract class ServicioDecorator implements IServicio, Cloneable {

	protected IServicio encapsulado;

	public ServicioDecorator(IServicio encapsulado) {
		this.encapsulado = encapsulado;
	}

	@Override
	public Object clone() {
		ServicioDecorator servicioClonado = null;
		try {
			servicioClonado = (ServicioDecorator) super.clone();
			servicioClonado.encapsulado = (IServicio) servicioClonado.clone();
		} catch (CloneNotSupportedException e) {
		}
		return servicioClonado;
	}

}
