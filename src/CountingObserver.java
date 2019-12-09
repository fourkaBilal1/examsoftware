public class CountingObserver implements Observer {
    int counter;

    public CountingObserver(int counter) {
        this.counter = counter;
    }

    public CountingObserver() {
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}