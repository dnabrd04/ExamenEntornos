package jcolonia.daw2022.mayo;

import java.util.Scanner;
import java.util.Vector;

/**
 * Clase que generara y mostrara una lista de opciones
 * para que el usuario pueda eligir la opcion deseada.
 * 
 * @author Diego Matías Nabrdalik Furlani &lt;<a href=
 *         "mailto:diegom.nabfur.jcolonia@gmail.com">diegom.nabfur.jcolonia@gmail.com</a>&gt;
 * @version 20230517000 
 * 
 */

public class VistaMenúBásico extends Vista{	

	
	/**Lista donde se guardaran las opciones  */
	private Vector <String> lista;
	/** Entrada*/
	private Scanner sc;

	/**
	 * Constructor de la clase que recibira una lista
	 * con opciones que seran las que utilizara como menu.
	 * @param scEntrada la entrada estandar.
	 * @param TÍTULO_MENÚ_PRINCIPAL es el titulo del menu
	 * @throws VistaException si ya existe una entrada.
	 */
	public VistaMenúBásico(String TÍTULO_MENÚ_PRINCIPAL, Scanner scEntrada) throws VistaException {
		super(TÍTULO_MENÚ_PRINCIPAL, scEntrada);
	}
	
	/**
	 * Constructor de la clase que recibira una lista
	 * con opciones que seran las que utilizara como menu.
	 * @param <T> tipo del que correspondera la lista de opciones.
	 * @param TÍTULO_MENÚ_PRINCIPAL es el titulo del menu
	 * @param OPCIONES_MENÚ_EJEMPLO las opciones que tendra el menu.
	 */
	public <T> VistaMenúBásico(String TÍTULO_MENÚ_PRINCIPAL, T[] OPCIONES_MENÚ_EJEMPLO) {
		super(TÍTULO_MENÚ_PRINCIPAL);
		lista = new Vector <>();
		
		for(T elemeto: OPCIONES_MENÚ_EJEMPLO) {
			lista.add(elemeto.toString());
		}
		sc = new Scanner(System.in);
	}

	/**
	 * Muestra todas las opciones del menu.
	 */
	public void mostrarOpciones() {
		int i;
		for(i = 0; i < lista.size(); i++) {
			System.out.printf("%d) %s%n", i+1, lista.get(i));
		}
		System.out.println("0) Salir\n");
		
	}
	
	/**
	 * Pide al usuario la opcion desada.
	 * @return respuesta la opcion deseada por el ususario.
	 * @throws VistaException 
	 */
	public int pedirOpción() throws VistaException {
		int respuesta = pedirEntero("Escriba un numero de opcion «0» para salir.", 0, lista.size());
		System.out.println();
		System.out.println();
		
		return respuesta;
	}

}
