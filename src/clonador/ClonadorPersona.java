package clonador;

import java.util.ArrayList;
import java.util.List;

import persona.Persona;
import persona.PersonaData;

public class ClonadorPersona {
	
	private String nombre;
	
	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> generar() {
		
		List<Persona> clones = new ArrayList<Persona>();
		generadorPersonas(clones);
		return clones;
		
		
	}

	private void generadorPersonas(List<Persona> clones) {
		
		int contador = 0;
		while(contador != 10) {
			Persona p = new Persona(nombre,(int)(Math.random()*PersonaData.EDAD_SUPERIOR),(int)(Math.random()*PersonaData.PESO_SUPERIOR),(int)(Math.random()*PersonaData.ALTURA_SUPERIOR));
			if(PersonaData.comprobarLimites(p) == true) {
				clones.add(p);
				contador++;
			}
			
		}
	}
	
}
