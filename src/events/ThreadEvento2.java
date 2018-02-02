package events;

public class ThreadEvento2 extends Thread {
	private MyClass c;

	public ThreadEvento2(MyClass c) {
		super("TH2");
		this.c = c;
	}

	public void run() {
		System.out.println("Arrancamos ThreadEvento2");
		
		int cont = 1;
		while (true) {
			c.fireMyEvent(new MyEvent("Evento2 -> " + cont));
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
