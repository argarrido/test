package model.shared;

import java.util.ArrayList;

import model.interfaces.IServicio;
import model.interfaces.MedioDePago;
import model.abonado.Abonado;
import model.pagos.Cheque;
import model.pagos.Efectivo;
import model.pagos.Tarjeta;

public class Factura implements Cloneable {

	private Abonado titular;

	/**
	 * <b>pre:</b> titular debe ser distinto de null<br>
	 * <b>post:</b> crea una nueva Factura
	 */
	public Factura(Abonado titular) {
		this.titular = titular;
	}

	public Abonado getTitular() {
		return titular;
	}

	public void setTitular(Abonado titular) {
		this.titular = titular;
	}

	public double totalSinDescuento() {
		// Recorro hashMap del abonado y sumo el valor de sus servicios contratados
		double total = 0;
		for (IServicio servicio : this.titular.getContrataciones().values()) {
			total += servicio.getValor();
		}
		return total;
	}

	public double totalConDescuento(MedioDePago medioDePago) {
		return titular.pago(medioDePago, this);
	}

	/**
	 * Clonacion condicional, si el titular es una persona fisica la factura se
	 * clona correctamente, en caso contrario, si es una persona juridica, arroja
	 * una excepcion y la propaga.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Factura facturaClonada = null;
		facturaClonada = (Factura) super.clone();
		facturaClonada.titular = (Abonado) this.titular.clone();
		return facturaClonada;
	}

	public void listarContrataciones() {
		System.out.println("**********FACTURA:**********");
		System.out.println(this.titular);
		System.out.println("Total bruto: $" + this.totalSinDescuento());
		System.out.println("Total pago en efectivo: $" + this.totalConDescuento(new Efectivo()));
		System.out.println("Total pago con cheque: $" + this.totalConDescuento(new Cheque()));
		System.out.println("Total pago con tarjeta: $" + this.totalConDescuento(new Tarjeta()) + "\n");
	}

}
