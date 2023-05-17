package jcolonia.daw2022.mayo;

/**
 * Excepción usada por la clase {@link AgendaTeléfonos} cuando no es un número o la longitud no es adecuada
 * @author Diego Matías Nabrdalik Furlani &lt;<a href=
 *         "mailto:diegom.nabfur.jcolonia@gmail.com">diegom.nabfur.jcolonia@gmail.com</a>&gt;
 * @version 20230425000
 */
public class DatosException extends Exception {
	
	/** Identificación de versión de la clase.*/
	private static final long serialVersionUID = 20230517000L;

	/**
	 * Crea una nueva excepción sin ningún contenido. No contiene ningún texto
	 * descriptivo.
	 * 
	 * @see Exception#Exception()
	 */
	public DatosException() {

	}

	/**
	 * Crea una nueva excepción con un texto descriptivo.
	 * 
	 * @param mensaje el texto correspondiente.
	 * @see Exception#Exception(String)
	 */
	public DatosException(String mensaje) {
		super(mensaje);
	}
	
	/**
	 * Crea una excepción que contiene otra –o cualquier {@link Throwable}. Emplea
	 * como texto descriptivo el de la excepción encapsulada.
	 * 
	 * @param causa la excepción a incorporar
	 * @see Exception#Exception(Throwable)
	 * 
	 */
	public DatosException(Throwable causa) {
		super(causa);
	}

	/**
	 * Crea una excepción que contiene otra –o cualquier {@link Throwable} y un
	 * texto descriptivo personalizado. El texto descriptivo puede así ser diferente
	 * al de la excepción contenida.
	 * 
	 * @param mensaje el texto descriptivo a incorporar
	 * @param causa   la excepción a incorporar
	 * @see Exception#Exception(String, Throwable)
	 */
	public DatosException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

	/**
	 * Crea una excepción que contiene otra –o cualquier {@link Throwable} y un
	 * texto descriptivo personalizado; con posibilidad de habilitar o deshabilitar
	 * la supresión o la edición de pila.
	 * 
	 * @param mensaje            el texto descriptivo a incorporar
	 * @param causa              la excepción a incorporar
	 * @param habilitarSupresión si la supresión está habilitada o no
	 * @param trazaPilaEditable  si la edición de pila está habilitada o no
	 * @see Exception#Exception(String, Throwable, boolean, boolean)
	 * @see Throwable#fillInStackTrace()
	 * @see Throwable#addSuppressed(Throwable)
	 */
	public DatosException(String mensaje, Throwable causa, boolean habilitarSupresión, boolean trazaPilaEditable) {
		super(mensaje, causa, habilitarSupresión, trazaPilaEditable);
	}

}
