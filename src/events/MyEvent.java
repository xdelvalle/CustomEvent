package events;

import java.util.EventObject;

public class MyEvent extends EventObject {
	private static final long serialVersionUID = -1376558343843474969L;
	
	public MyEvent(Object source) {
		super(source);
	}
}
