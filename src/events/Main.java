package events;

public class Main {
	
	public MyClass c;
	
	public static void main(String[] args) {
		new Main().start();
	}

	private void start() {
		c = new MyClass();

		System.out.println("Escuchando eventos..");
		c.addMyEventListener(new MyEventListener() {
			@Override
			public void myEventOcurred(MyEvent event) {
				System.out.println("Event Fired!! " + event.toString());
			}
		});
		
		c.fireMyEvent(new MyEvent("Evento MAIN!! "));
		
		ThreadEvento1 th1 = new ThreadEvento1(c);
		ThreadEvento2 th2 = new ThreadEvento2(c);
		ThreadEvento3 th3 = new ThreadEvento3(c);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
