package excepciones;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionFile {
	public static void abrirFichero(String s) {
		try {
			FileReader f = new FileReader(s);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Abrir fichero ha terminado");
	}
	public static void main(String[] args) {
		abrirFichero("Direccion");
	}

}
