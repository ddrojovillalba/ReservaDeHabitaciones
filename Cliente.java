/**
 * 
 */
package DiagramaClase;

/**
 * @author David y Miguel
 *
 */
public class Cliente {
	
	//Atributos de la clase Cliente
	protected int numCliente;
	protected String nombre;
	protected String telefono;
	
	/**
	 * Constructor de la clase Cliente.
	 * @param numCliente Número de cliente.
	 * @param nombre Nombre del cliente.
	 * @param telefono Teléfono del cliente.
	 */
	public Cliente(int numCliente, String nombre, String telefono) {
		super();
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * Asigna un número al cliente.
	 * @param numCliente Número del cliente
	 */
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	/**
	 * Asigna un nombre al cliente.
	 * @param nombre Nombre del cliente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Asigna un teléfono al cliente.
	 * @param telefono Teléfono del cliente.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * Obtiene el número del cliente.
	 * @return Número de cliente.
	 */
	public int getNumCliente() {
		return numCliente;
	}
	
	/**
	 * Obtiene el nombre del cliente.
	 * @return Nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Obtiene el teléfono del cliente.
	 * @return Teléfono del cliente.
	 */
	public String getTelefono() {
		return telefono;
	}
	
}
