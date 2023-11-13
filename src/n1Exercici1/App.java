package n1Exercici1;

public class App {

	public static void main(String[] args) {
			
		NoGenericiMethods n = new NoGenericiMethods(3);
		
		DatosJugador j1=n.instanciarJugador ( );
		//asigno valor
		j1.setS("Luis");
		j1.setT(52);
		j1.setV(1.8);
		n.almacenarJugador(j1);
		DatosJugador j2=n.instanciarJugador ( );
		//asigno valor
		j2.setS(52);
		j2.setT(1.8);
		j2.setV("Luis");
		n.almacenarJugador(j2);
		DatosJugador j3=n.instanciarJugador ( );
		//asigno valor
		j3.setS(1.8);
		j3.setT("Luis");
		j3.setV(52);		
		n.almacenarJugador(j3);
	
		
		for (DatosJugador<?, ?, ?> jugador : n.getListaArray()) {
			System.out.println(jugador);
		}
		
		n.extaerJugador();
		n.extaerJugador();
		n.extaerJugador();
		
		
		for (DatosJugador<?, ?, ?> jugador : n.getListaArray()) {
			System.out.println(jugador);
		}
		
	}

}
