package concurrencia;

import java.util.*;

public class Hora extends Thread{
	public void run() {
		try {
			while(true) {
				sleep(1000);
				System.out.println(new Date().toString());
			}
		}catch(InterruptedException e) {
			return; /* termina esta hebra*/
		}
	}

}
