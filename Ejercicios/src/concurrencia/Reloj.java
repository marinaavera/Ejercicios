package concurrencia;

public class Reloj {
	public static void main(String[] args) {
		Hora hora = new Hora ();
		Sonido sonido = new Sonido();
		Hola hola = new Hola();
		hora.start();
		sonido.start();
		hola.start();
	}

}
