
public class CountingObserver implements Observer {
	int counter;
	public CountingObserver(int counter) {
		super();
		this.counter = counter;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public CountingObserver() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(Integer val) {
		// TODO Auto-generated method stub
		
	}

}
