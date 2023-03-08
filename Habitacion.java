/**
 * 
 */
package DiagramaClase;

/**
 * @author David y Miguel
 *
 */
public class Habitacion {

	//Atributos de la clase Habitacion
	protected int numHabitacion;
	protected String estado;
	protected int numCamas;
	
	/**
	 * Constructor de la clase Habitacion
	 * @param numHabitacion Número de habitación.
	 * @param estado Estado de la habitación.
	 * @param numCamas Número de camas de la habitación.
	 */
	public Habitacion(int numHabitacion, String estado, int numCamas) {
		this.numHabitacion = numHabitacion;
		this.estado = estado;
		this.numCamas = numCamas;
	}
	
	/**
	 * Obtiene el número de habitación.
	 * @return Número de habitación.
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}
	
	/**
	 * Asigna el número de habitación.
	 * @param numHabitacion Número de habitación.
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	
	/**
	 * Obtiene el estado de habitación.
	 * @return Estado de la habitación.
	 */
	public String getEstado() {
		return estado;
	}
	
	/**
	 * Asigna el estado de la habitación.
	 * @param estado Estado de la habitación.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/**
	 * Obtiene el número de camas.
	 * @return Número de camas.
	 */
	public int getNumCamas() {
		return numCamas;
	}
	
	/**
	 * Asigna el número de camas.
	 * @param numCamas Número de camas.
	 */
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}
	
}
