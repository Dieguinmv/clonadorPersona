package utilidades;

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
			Persona p = FactoryPersona.getPersona(nombre);
			
			boolean personaValida = ValidadorPersona.isValid(p);
			
			if(personaValida) {
				clones.add(p);
				contador++;
			}
			
			
		}
	}
	
}
