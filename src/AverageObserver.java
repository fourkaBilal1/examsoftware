
public class AverageObserver implements Observer {
	float average;
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public AverageObserver() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(Integer val) {
		this.average = (this.average+val)/2;
		
	}

}
