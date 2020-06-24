package model.servicios;

public class Internet500 extends Servicio {

	@Override
	public String getDescripcion() {
		return "Servicio base Internet500";
	}

	@Override
	public double getValor() {
		return 1000;
	}

	@Override
	public String toString() {
		return "Internet500 [" + getDescripcion() + "]";
	}

}
