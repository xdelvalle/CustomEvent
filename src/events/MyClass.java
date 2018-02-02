package events;

import javax.swing.event.EventListenerList;

public class MyClass {
	public EventListenerList listenerList = new EventListenerList();
	
	public void addMyEventListener(MyEventListener listener) {
		listenerList.add(MyEventListener.class, listener);
	}
	
	public void removeMyEventListener(MyEventListener listener) {
		listenerList.remove(MyEventListener.class, listener);
	}
	
	public void fireMyEvent(MyEvent event) {
		Object[] listeners = listenerList.getListenerList();
		for(int i=0; i<listeners.length; i=i+2) {
			if(listeners[i] == MyEventListener.class) {
				((MyEventListener) listeners[i+1]).myEventOcurred(event);
			}
		}
	}
}
