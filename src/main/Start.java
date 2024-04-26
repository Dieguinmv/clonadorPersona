package main;

import java.util.List;

import persona.Persona;
import utilidades.ClonadorPersona;

public class Start {

	public static void main(String[] args) {

		ClonadorPersona cp = new ClonadorPersona("Eduardo");
		List<Persona> personas = cp.generar();
		System.out.println(personas);

	}

}
