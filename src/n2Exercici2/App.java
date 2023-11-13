package n2Exercici2;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ("Ana", "Martínez", 19);
		Persona p2 = new Persona ("Jose", "Roures", 32);
		Persona p3 = new Persona ("Eva", "Castillo", 45);
		Persona p4 = new Persona ("Mar", "Caballero", 28);
		Persona p5 = new Persona ("Raul", "Xirac", 37);
		Persona p6 = new Persona ("Pol", "Ugaza", 64);
				
		GenericMethods g= new GenericMethods();
		
	    Persona[] arrayPersona = {p1,p2,p3,p4,p5,p6};
	    
	    g.aceptaGenericos(arrayPersona);
	   
	}

}


