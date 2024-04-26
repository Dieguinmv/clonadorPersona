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

	public List<Persona> generar(){
		
		List<Persona> clones = new ArrayList<Persona>();
		for(int i =0;i<11;i++) {
			
			try{
				Persona p = FactoryPersona.getPersona(nombre);
				clones.add(p);
			} catch(Exception e) {}	
		}
		return clones;
		
		
	}

	
}
