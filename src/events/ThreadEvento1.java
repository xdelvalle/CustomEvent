package events;

public class ThreadEvento1 extends Thread {
	private MyClass c;
	
	public ThreadEvento1(MyClass c) {
		super("TH1");
		this.c = c;
	}
	
	public void run() {
		System.out.println("Arrancamos ThreadEvento1");
		
		int cont = 1;
		while (true) {
			c.fireMyEvent(new MyEvent("Evento1 -> " + cont));
			cont++;
			pausa(5000);
		}
	}
	
	private void pausa(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) { }
	}
}
