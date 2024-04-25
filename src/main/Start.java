package main;

import java.util.List;

import clonador.ClonadorPersona;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
	
		ClonadorPersona cp = new ClonadorPersona("Eduardo");
		try {
			List<Persona> personas = cp.generar();
			System.out.println(personas);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
