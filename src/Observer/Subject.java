package Observer;
import java.util.*;
public class Subject {
	private int state;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyallobserver();
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void deattach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyallobserver() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
}
