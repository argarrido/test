package prueba;

import model.excepciones.ServicioInvalidoException;
import model.interfaces.IServicio;
import model.interfaces.MedioDePago;
import model.abonado.Abonado;
import model.abonado.PersonaFisica;
import model.abonado.PersonaJuridica;
import model.pagos.Cheque;
import model.pagos.Efectivo;
import model.pagos.Tarjeta;
import model.servicios.ServicioFactory;
import model.shared.Domicilio;
import model.shared.Factura;
import model.shared.Sistema;

public class Main {

	public static void main(String[] args) {

		// ABONADOS
		Abonado pf1 = new PersonaFisica("Leonel Guccione", "2439283");
		Abonado pj1 = new PersonaJuridica("Guillermo Lazurri", "29823041");
		Abonado pf2 = new PersonaFisica("Ivonne Gellon", "23309384");
		

		// DOMICILIOS
		Domicilio d1 = new Domicilio("Luro", "2222");
		Domicilio d2 = new Domicilio("Colon", "4343");
		Domicilio d3 = new Domicilio("J.B. Justo", "2456");
		Domicilio d4 = new Domicilio("Malvinas", "7334");
		Domicilio d5 = new Domicilio("Juncal", "1534");
		Domicilio d6 = new Domicilio("Dorrego", "4444");
		
		Sistema sistema = Sistema.getSistemaSingletonInstance();
		Sistema.addAbonado(pf1);
		
//		// FACTURAS
//		Factura f1 = new Factura(pf1);
//		Factura f2 = new Factura(pj1);
//		Factura f3 = new Factura(pf2);
//		Factura fclone1 = null;
//
//		// MEDIOS DE PAGO
//		MedioDePago efectivo = new Efectivo();
//		MedioDePago cheque = new Cheque();
//		MedioDePago tarjeta = new Tarjeta();
//
//		try {
//			// INICIALIZACION DE SERVICIOS
//			IServicio s1 = ServicioFactory.getServicio("Internet100", true, false, false);
//			IServicio s2 = ServicioFactory.getServicio("Internet500", true, true, true);
//			IServicio s3 = ServicioFactory.getServicio("Internet500", false, false, false);
//			IServicio s4 = ServicioFactory.getServicio("Internet100", true, false, true);
//			IServicio s5 = ServicioFactory.getServicio("Internet100", false, true, false);
//			IServicio s6 = ServicioFactory.getServicio("Internet500", false, false, true);
//
//			// ASIGNACION DE SERVICIOS A ABONADOS
//			pf1.contratarServicio(d1, s1);
//			pj1.contratarServicio(d2, s2);
//			pj1.contratarServicio(d3, s3);
//			pf2.contratarServicio(d4, s3);
//			pf2.contratarServicio(d5, s4);
//			pf2.contratarServicio(d6, s5);
//
//			// PRUEBA EXCEPCION SERVICIO INCORRECTO
//			IServicio s7 = ServicioFactory.getServicio("Internet700", false, false, false);
//		} catch (ServicioInvalidoException e) {
//			System.out.println(e.getMessage());
//		}
//
//		// LISTAR FACTURAS
//		f1.listarContrataciones();
//		f2.listarContrataciones();
//		f3.listarContrataciones();
//
//		try {
//			fclone1 = (Factura) f1.clone();
//			System.out.println("FACTURA CLONADA");
//			fclone1.listarContrataciones();
//			Factura fclone2 = (Factura) f2.clone();
//			System.out.println("FACTURA CLONADA");
//			fclone2.listarContrataciones();
//		} catch (CloneNotSupportedException e) {
//			System.out.println("La factura no se pudo clonar. " + e.getMessage() + "\n");
//		}
//
//		// PRUEBA DE CLONE
//		fclone1.getTitular().setNombre("Juan Perez");
//		System.out.println("FACTURA CLONADA MODIFICADA");
//		fclone1.listarContrataciones();
//
//		System.out.println("FACTURA ORIGINAL");
//		f1.listarContrataciones();
//
//		// DOUBLE DISPATCH
//		System.out
//				.println(f1.getTitular().getNombre() + " pago $" + f1.getTitular().pago(efectivo, f1) + " en efectivo");
//		System.out.println(f2.getTitular().getNombre() + " pago $" + f2.getTitular().pago(cheque, f2) + " con cheque");
//		System.out
//				.println(f3.getTitular().getNombre() + " pago $" + f3.getTitular().pago(tarjeta, f3) + " con tarjeta");

	}

}
