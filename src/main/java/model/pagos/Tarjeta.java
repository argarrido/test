package model.pagos;

import model.interfaces.MedioDePago;
import model.shared.Factura;

public class Tarjeta implements MedioDePago {

	@Override
	public double personaFisica(Factura factura) {
		return factura.totalSinDescuento();
	}

	@Override
	public double personaJuridica(Factura factura) {
		return 1.2 * factura.totalSinDescuento();
	}

}
