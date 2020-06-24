package model.pagos;

import model.interfaces.MedioDePago;
import model.shared.Factura;

public class Efectivo implements MedioDePago {

	@Override
	public double personaFisica(Factura factura) {
		return 0.8 * factura.totalSinDescuento();
	}

	@Override
	public double personaJuridica(Factura factura) {
		return 0.9 * factura.totalSinDescuento();
	}

}
