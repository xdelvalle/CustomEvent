package events;

import java.util.EventListener;

public interface MyEventListener extends EventListener{
	public void myEventOcurred(MyEvent event);
}
