package concurrencia;

public class Reloj {
	public static void main(Tring[] args) {
		Hora hora = new Hora ();
		Sonido sonido = new Sonido();
		Hola hola = new Hola();
		hola.start();
		sonido.start();
		hola.start();
	}

}
