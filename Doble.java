/**
 * 
 */
package DiagramaClase;

/**
 * @author David y Miguel
 *
 */
public class Doble extends Habitacion {

	//Atributos de la clase Doble
	private boolean minibar;
	
	/**
	 * Constructor de la clase Doble.
	 * @param minibar Minibar de la Doble.
	 * @param numHabitacion Número de habitación de la Doble.
	 * @param estado Estado de la Doble.
	 * @param numCamas Número de camas de la Doble.
	 */
	public Doble(boolean minibar, int numHabitacion, String estado, int numCamas) {
		super(numHabitacion, estado, numCamas);
		this.minibar = minibar;
	}

	/**
	 * Obtiene si hay minibar o no.
	 * @return Si hay minibar o no.
	 */
	public boolean isMinibar() {
		return minibar;
	}

	/**
	 * Asigna el minibar de la Doble.
	 * @param minibar El minibar de la Doble.
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	/**
	 * Calcula los descuentos de la Doble.
	 */
	public void calcularDescuentos() {
		
	}
	
	
}
