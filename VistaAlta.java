package jcolonia.daw2022.mayo;

/**
 * Maneja la entrada de numeros de telefono con sus respectivos nombres.
 * @author Diego Matías Nabrdalik Furlani &lt;<a href=
 *         "mailto:diegom.nabfur.jcolonia@gmail.com">diegom.nabfur.jcolonia@gmail.com</a>&gt;
 * @version 20230517000
 *
 */
public class VistaAlta {

	/**Inicializa la vista de altas de telefono.*/
	public VistaAlta() {

	}
	
	/**
	 * Es la opcion que pedira el nombre de la persona del telefono 
	 * @return numero de telefono
	 * @throws VistaException 
	 */
	public Integer pedirNumero() throws VistaException {
		int numero = Vista.pedirEntero("Escriba el numero de teléfono", 0, 999999999);
		return numero;
	}

	/**
	 * es la opcion que pedira el numero de telefono
	 * @return nombre de la persona asignada al telefono.
	 */
	public String pedirNombre() {
		String nombre = Vista.pedirTexto("Escriba el nombre del contacto");
		return nombre;
	}
}
