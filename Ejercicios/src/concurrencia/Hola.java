package concurrencia;

public class Hola extends Thread{
	public void run() {
		try {
			while(true) {
				sleep(5000);
				System.out.println("Hola");
				}
			}	catch(InterruptedException e) {
				return;
			}
		}
}


