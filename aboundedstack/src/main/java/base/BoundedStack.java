package base;

import cool.runtime.ExtensionsGroup;
import cool.runtime.Mutex;
import cool.runtime.Selfex;

public class BoundedStack implements Stack {

	protected Object[] buffer;

	private int usedSlots = 0;

	public BoundedStack(int capacity) {
		this.buffer = new Object[capacity];
	}

	@Selfex
	@Mutex
	@ExtensionsGroup("pop")
	public Object pop() {
		Object result = buffer[usedSlots - 1];
		usedSlots--;
		buffer[usedSlots] = null;
		return result;
	}

	@Selfex
	@Mutex
	@ExtensionsGroup("push")
	public void push(Object obj) {
		buffer[usedSlots] = obj;
		usedSlots++;
	}

}
