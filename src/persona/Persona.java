package persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	
	/**
	 * Constructor de la clase Persona que solicita ciertos parametros que seran mas adelante los atributos de la clase bean
	 * @param nombre String que solicita para que sea el nombre de la Persona
	 * @param edad int que solicita  para que sea la edad de la Persona
	 * @param peso int que solicita para que sea el peso de la Persona
	 * @param altura int que solicita para que sea la altura de la Persona
	 */
	
	public Persona(String nombre, int edad, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	/**
	 * Constructor por defecto que utilizaremos para utilizar los setters para el apartado de las excepciones
	 */
	public Persona() {
		
	}
	
	
	/**
	 * 
	 * @return el nombre de la Persona
	 */
	
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre el nombre del setter
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return la edad de la Persona
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad int que solicita el setter
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * 
	 * @return el peso de la Persona
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * 	
	 * @param peso int que solicita el setter para convertirse en el peso de la Persona
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * 
	 * @return la altura de la Persona
	 */
	
	public int getAltura() {
		return altura;
	}
	
	/**
	 * 
	 * @param altura int que solicita el setter para convertirse en la altura de la Persona
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	

	
	@Override
	public String toString() {
		return "[" + nombre + "," + edad + "," + peso + "," + altura + "]";
	}
	
	
	
	
	
}
