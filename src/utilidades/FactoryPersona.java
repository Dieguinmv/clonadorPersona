package utilidades;

import persona.Persona;

public class FactoryPersona {

	public static Persona getPersona(String nombre) {
		
		Persona p = new Persona(nombre, (int)(Math.random()*100), (int)(Math.random()*101), (int)(Math.random()*201));
		
		return p;
	}

}
