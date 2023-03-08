/**
 * 
 */
package DiagramaClase;

import java.util.Date;

/**
 * @author David y Miguel
 *
 */
public class Reserva {

	//Atributos de la clase Reserva
	private int numReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numPersonas;
	
	/**
	 * Constructor de la clase Reserva.
	 * @param numReserva Número de reserva.
	 * @param fechaEntrada Fecha de entrada.
	 * @param fechaSalida Fecha de salida.
	 * @param numPersonas Número de personas.
	 */
	public Reserva(int numReserva, Date fechaEntrada, Date fechaSalida, int numPersonas) {
		this.numReserva = numReserva;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonas = numPersonas;
	}
	
	/**
	 * Obtiene el número de reserva.
	 * @return Número de reserva.
	 */
	public int getNumReserva() {
		return numReserva;
	}
	
	/**
	 * Asigna el número de reserva.
	 * @param numReserva Número de reserva.
	 */
	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}
	
	/**
	 * Obtiene la fecha de entrada.
	 * @return Fecha de entrada.
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	
	/**
	 * Asigna la fecha de entrada.
	 * @param fechaEntrada Fecha de entrada.
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	
	/**
	 * Obtiene la fecha de salida.
	 * @return Fecha de salida.
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}
	
	/**
	 * Asigna la fecha de salida.
	 * @param fechaSalida Fecha de salida.
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	/**
	 * Obtiene el número de personas.
	 * @return Número de personas.
	 */
	public int getNumPersonas() {
		return numPersonas;
	}
	
	/**
	 * Asigna el número de personas.
	 * @param numPersonas Número de personas.
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}
}
