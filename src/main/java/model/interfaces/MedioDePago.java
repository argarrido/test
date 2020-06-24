package model.interfaces;

import model.shared.Factura;

public interface MedioDePago {

	double personaFisica(Factura factura);

	double personaJuridica(Factura factura);
}
