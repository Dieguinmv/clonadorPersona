package clonador;

import java.util.ArrayList;
import java.util.List;

import persona.Persona;

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
		for(int i=0;i<11;i++) {
			Persona p = new Persona(nombre,(int)(Math.random()*101),(int)(Math.random()*201),(int)(Math.random()*100));
			clones.add(p);
		}
	}
	
}
