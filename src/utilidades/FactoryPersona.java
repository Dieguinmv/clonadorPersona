package utilidades;

import persona.Persona;
import persona.PersonaData;

public class FactoryPersona {

	public static Persona getPersona(String nombre) throws Exception {
		
		Persona p = new Persona();
		int edad =  (int)(Math.random()*100);
		if(edad<=PersonaData.EDAD_INFERIOR || edad>= PersonaData.EDAD_SUPERIOR) {
			throw new Exception("Edad no valida");
		}
		p.setEdad(edad);
		
		
		int peso = (int)(Math.random()*101);
		if(peso<=PersonaData.PESO_INFERIOR || peso>= PersonaData.PESO_SUPERIOR) {
			throw new Exception("Peso no valido");
		}
		p.setPeso(peso);
		
		int altura = (int)(Math.random()*201);
		if(altura<= PersonaData.ALTURA_INFERIOR || altura >= PersonaData.ALTURA_SUPERIOR) {
			throw new Exception("Altura no valida");
		}
		p.setAltura(altura);
		
		p.setNombre(nombre);
		return p;
	}

}
