package jcolonia.daw2022.mayo;

import java.util.List;
import java.util.Vector;

/**
 * Maneja un listado de numeros de telefono con sus respectivos nombres.
 * @author Diego Matías Nabrdalik Furlani &lt;<a href=
 *         "mailto:diegom.nabfur.jcolonia@gmail.com">diegom.nabfur.jcolonia@gmail.com</a>&gt;
 * @version 20230517000
 *
 */
public class VistaListado {

	/**La agenda que guarda numeros de teléfono con sus nombres.*/
	private AgendaTeléfonos agenda;
	/**La lista que se imprimira con los datos de agenda.*/
	private List<String> listaAgenda;

	/**
	 * Inicializa la vista con los valores de la lista
	 * @param agenda 
	 */
	public VistaListado(AgendaTeléfonos agenda) {
		this.agenda = agenda;
		listaAgenda = new Vector<>();
		listaAgenda.addAll(agenda.toListaTextos());
	}
	
	/**
	 * 
	 */
	public void listar() {
		int i = 0;
		boolean salir = true;
		if(listaAgenda.size() == 0) {
			System.out.println("La lista esta vacia.");
		}
		for(String elemento :listaAgenda) {
			System.out.println(elemento);
			i++;
			if (i % 10 == 0) {
				salir = Vista.pedirConfirmación("Quiere continuar el listado %s");
				if (salir == false) {
					break;
				}
			}
		}
		
	}

}
