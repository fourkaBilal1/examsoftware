
public class ObservableLifo implements IntegerBasicContainer, Observable {
	int capacity;
	int nb=0;
	Integer[] queue;
	public ObservableLifo(int capacity) {
		this.capacity = capacity;
		this.queue = new Integer[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void addObserver(Observer o) {
		
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendNotification(Integer val) {
		
		
	}

	@Override
	public boolean insertElement(Integer e) {
		if(this.nb==this.capacity){
			System.out.println("la pile est pleine");
			return false;
		}else{
			queue[nb]=e;
			return true;
		}
	}

	@Override
	public Integer element() {
		
		return this.queue[this.nb];
	}

	@Override
	public Integer popElement() {
		Integer x = null;
		if(nb==0){
			System.out.println("la pile est vide");
		}else{
			x = this.queue[nb];
			this.queue[nb]=null;
			nb--;
		}
		return x;
	}

	@Override
	public int size() {
		return this.nb;
	}

	@Override
	public int capacity() {
		return this.capacity;
	}

}
