package persona;



public class PersonaData {
	
	public static final int PESO_INFERIOR = 50;
	public static final int PESO_SUPERIOR = 100;
	public static final int ALTURA_INFERIOR = 130;
	public static final int ALTURA_SUPERIOR = 200;
	public static final int EDAD_INFERIOR = 1;
	public static final int EDAD_SUPERIOR = 99;
	
	
	public static boolean comprobarLimites(Persona p) {
		
		if((p.getPeso() >=PESO_INFERIOR && p.getPeso()<= PESO_SUPERIOR) && 
				(p.getAltura()>=ALTURA_INFERIOR && p.getAltura()<= ALTURA_SUPERIOR) && 
					(p.getEdad() >= EDAD_INFERIOR && p.getEdad()<=EDAD_SUPERIOR)) {
			
			return true;
		}
		
		else return false;

	}
	
	


	
	
}
