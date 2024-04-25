package clonador;

import java.util.ArrayList;
import java.util.List;
import excepciones.*;
import persona.Persona;
import persona.PersonaData;

public class ClonadorPersona {
	
	private String nombre;
	
	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> generar() throws IllegalPersonaException {
		
		List<Persona> clones = new ArrayList<Persona>();
		generadorPersonas(clones);
		return clones;
		
		
	}

	private void generadorPersonas(List<Persona> clones) throws IllegalPersonaException {
		
		int contador = 0;
		while(contador != 10) {
			Persona p = new Persona(nombre,(int)(Math.random()*PersonaData.EDAD_SUPERIOR),(int)(Math.random()*PersonaData.PESO_SUPERIOR),(int)(Math.random()*PersonaData.ALTURA_SUPERIOR));
			if(PersonaData.comprobarLimites(p) == true) {
				clones.add(p);
				contador++;
			}
			else throw new IllegalPersonaException("La persona que intenta añadir no cumple con los limites");
			
		}
	}
	
}
