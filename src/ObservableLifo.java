
public class ObservableLifo implements IntegerBasicContainer, Observable {
	int capacity;
	int nb=0;
	int i=0;
	Integer[] queue;
	Observer[] ObserverCollection = new Observer[2];
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
		this.ObserverCollection[this.i]=o;
		i++;	
	}

	@Override
	public void removeObserver(Observer o) {
		if(this.i!=0){ 
			this.queue[i]=null;
			this.i--;
		}
	}

	@Override
	public void sendNotification(Integer val) {
		for(int j =0;j<this.i;j++) {
			this.ObserverCollection[j].update(val);
		}
		
		
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
