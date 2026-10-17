package recursividad;

public class UsaRecursividad {
	public static void main (String[] args) {
		Recursividad r = new Recursividad();
		try {
			System.out.println("El resultado es: " + r.aritmeticaRe(100, 20, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
