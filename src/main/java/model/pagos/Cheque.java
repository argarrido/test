package model.pagos;

import model.interfaces.MedioDePago;
import model.shared.Factura;

public class Cheque implements MedioDePago {

	@Override
	public double personaFisica(Factura factura) {
		return factura.totalSinDescuento() * 1.1;
	}

	@Override
	public double personaJuridica(Factura factura) {
		return 1.15 * factura.totalSinDescuento();
	}

}
