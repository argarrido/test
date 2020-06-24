package model.servicios;

public class Internet100 extends Servicio {

	@Override
	public String getDescripcion() {
		return "Servicio base Internet100";
	}

	@Override
	public double getValor() {
		return 850;
	}

	@Override
	public String toString() {
		return "Internet100 [" + getDescripcion() + "]";
	}

}
