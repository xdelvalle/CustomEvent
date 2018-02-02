package events;

public class ThreadEvento3 extends Thread {
	private MyClass c;

	public ThreadEvento3(MyClass c) {
		super("TH3");
		this.c = c;
	}

	public void run() {
		System.out.println("Arrancamos ThreadEvento3");
		
		int cont = 1;
		while (true) {
			c.fireMyEvent(new MyEvent("Evento3 -> " + cont));
			cont++;
			pausa(5000);
		}
	}

	private void pausa(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch (InterruptedException ex) {
		}
	}
}
