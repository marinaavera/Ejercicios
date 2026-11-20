package concurrencia;

import java.awt.Toolkit;
import java.util.Scanner;

public class Sonido extends Thread {
	public void run() { /* código concurrente */
		Scanner sc = new Scanner(System.in);
		while(true) {
			sc.nextLine();
			Toolkit.getDefaultToolkit().beep();
		}
	}
}
