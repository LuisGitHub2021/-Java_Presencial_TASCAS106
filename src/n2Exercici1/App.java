package n2Exercici1;

public class App {

	public static void main(String[] args) {
		
		Persona p = new Persona ("Luis", "Sandiumenge", 52);
		
		GenericMethods g= new GenericMethods();
		
		g.aceptaGenericos("Hola, ", p, true);

	}

}
