package n1Exercici1;

public class NoGenericiMethods{ 
	
	private DatosJugador listaArray[];
	private int lengthMaxArray;
	private int numElementosArray;
	
	public NoGenericiMethods(int lengthMaxArray ) {
		int numElementosArray=0;
		this.lengthMaxArray=lengthMaxArray;
		listaArray=new DatosJugador[lengthMaxArray];
		 }
	
	public DatosJugador[] getListaArray() {
		return listaArray;
	}
 
	
	public void almacenarJugador (DatosJugador jugador) {
		if (numElementosArray<lengthMaxArray) {
			listaArray [numElementosArray++] = jugador;
			
		}else {
			System.out.println("No hay mas capacidad de almacenaje en este array");
		}
		 }
	
	public void extaerJugador() {
		
		if (! (numElementosArray==0))  {
	
			listaArray[--numElementosArray]=null;
		}else {
			System.out.println("No se puede borrar más elemnetos que los existentes");
		}

	 }	
	
	/*public <T, S, V> DatosJugador<T, S, V> inicializarJugador(T t, S s, V v) {
		
		return new DatosJugador <> (t, s, v);
	}*/

	public  DatosJugador  instanciarJugador() {
		
		//Box rawBox = new Box();
		DatosJugador rawN = new DatosJugador();
					
		return rawN;
	}
}
		
	