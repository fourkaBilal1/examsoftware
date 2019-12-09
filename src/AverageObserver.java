public class AverageObserver implements Observer{
    float average;

    public AverageObserver(float average) {
        this.average = average;
    }

    public AverageObserver() {
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}