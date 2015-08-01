package base;


public class WriterThread extends BufferClientThread {

	public WriterThread(BoundedStack shared) {
		super(shared);
	}

	public WriterThread(BoundedStack shared, int ops) {
		super(shared, ops);
	}

	protected void accessBuffer() {
		shared.push(new Object());
	}

}
