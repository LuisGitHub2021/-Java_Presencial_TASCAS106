package n1Exercici1;

public class DatosJugador <T, S, V> {
		
	private T t;
	private S s;
	private V v;
	
	public DatosJugador() {
		/*super();
		this.t = t;
		this.s = s;
		this.v = v;*/
	}

	public void setT(T t){
		this.t = t;
		}
	
	public  void setS(S s) {
		this.s = s;
		}
	
	public  void setV(V v) {
		this.v = v;
		}

	@Override
	public String toString() {
		return "DatosJugador [t=" + t + ", s=" + s + ", v=" + v + "]";
	}

}
