package model.servicios;

import model.interfaces.IServicio;

public abstract class Servicio implements IServicio, Cloneable {

	private int s;
	private static int nroId = 0;
	private int id;

	public Servicio() {
		nroId++;
		this.id = nroId;
	}

	public static int getNroId() {
		return nroId;
	}

	public int getId() {
		return id;
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
		return "Servicio [id=" + id + "]";
	}
	

}
