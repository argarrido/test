package model.shared;

import java.util.HashSet;

import model.abonado.Abonado;

public class Sistema {
	
	// Instancia del singleton
	private static Sistema sistemaInstance = null;
	
	// Domicilios representa la totalidad de los domicilios existentes, evitando así duplicaciones.
	private static HashSet<Domicilio> domicilios;
	private static HashSet<Abonado> abonados;
	
	// Constructor privado para singleton
	private Sistema() {
		Sistema.domicilios = new HashSet<Domicilio>();
		Sistema.abonados = new HashSet<Abonado>();
	}
	
	/**
	 * Método para obtener la instancia de Sistema 
	 * @return siempre la misma instancia de Sistema
	 */
	public static Sistema getSistemaSingletonInstance() {
		if(sistemaInstance == null) {
			sistemaInstance = new Sistema();
		}
		return sistemaInstance;
	}
	
	/**
	 * Agrega abonado al Set de abonados. En caso de que el abonado ya exista (compara el dni del mismo), arroja una excepción avisando al usuario de la situación.
	 * @param abonado
	 */
	public static void addAbonado(Abonado abonado) {
		if(!Sistema.abonados.add(abonado)) {
			// TODO arrojar excepción
			System.out.println("Abonado con dni duplicado!!");
		}
	}
	
	public static boolean existeDomicilio(Domicilio domicilio) {
		return Sistema.abonados.contains(domicilio);
	}
	
	public static void addDomicilio(Domicilio domicilio) {
		Sistema.domicilios.add(domicilio);
	}

}
