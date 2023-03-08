/**
 * 
 */
package DiagramaClase;

/**
 * @author David y Miguel
 *
 */
public class Suite extends Habitacion{

	//Atributos de la clase Suite
	protected int metros;
	protected String servicios;
	
	/**
	 * Constructor de la clase Suite.
	 * @param numHabitacion Número de la habitación.
	 * @param estado Estado de la habitación.
	 * @param numCamas Número de camas de la habitación.
	 * @param metros Metros de la habitación.
	 * @param servicios Servicios de la habitación.
	 */
	public Suite(int numHabitacion, String estado, int numCamas, int metros, String servicios) {
		super(numHabitacion, estado, numCamas);
		this.metros = metros;
		this.servicios = servicios;
	}
	
	/**
	 * Obtiene los metros de la Suite.
	 * @return Metros de la Suite.
	 */
	public int getMetros() {
		return metros;
	}

	/**
	 * Asigna los metros de la Suite.
	 * @param metros Metros de la Suite.
	 */
	public void setMetros(int metros) {
		this.metros = metros;
	}

	/**
	 * Obtiene los servicios de la Suite.
	 * @return Servicios de la Suite.
	 */
	public String getServicios() {
		return servicios;
	}

	/**
	 * Asigna los servicios de la Suite.
	 * @param servicios Servicios de la Suite.
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
	
	/**
	 * Calcula los gastos de la Suite.
	 */
	public void calcularGastos() {
		
	}
}
