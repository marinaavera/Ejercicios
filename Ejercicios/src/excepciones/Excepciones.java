package excepciones;

public class Excepciones {
	public static int accederValor(int[] arr, int i) {
		int e = Integer.parseInt("abc");
		int valor = arr[1];
		System.out.println("Valor:" + valor);
		return valor;
	}
	public static void main (String[] args) {
		System.out.println("Empieza mi programita!");
			int[] arr = {1,2,3};
			try {
			System.out.println(accederValor(arr,5));
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Este índice no es válido.");
			}
			catch(Exception e) {
				System.out.println("Algo ha ido mal.");
			}
	}
}


