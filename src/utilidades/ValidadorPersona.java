package utilidades;

import persona.Persona;
import persona.PersonaData;

public class ValidadorPersona {

	public static boolean isValid(Persona p) {
		
		if((p.getPeso() >=PersonaData.PESO_INFERIOR && p.getPeso()<= PersonaData.PESO_SUPERIOR) && 
				(p.getAltura()>=PersonaData.ALTURA_INFERIOR && p.getAltura()<= PersonaData.ALTURA_SUPERIOR) && 
					(p.getEdad() >= PersonaData.EDAD_INFERIOR && p.getEdad()<=PersonaData.EDAD_SUPERIOR)) {
			
			return true;
		}
		
		else return false;
	}


}
