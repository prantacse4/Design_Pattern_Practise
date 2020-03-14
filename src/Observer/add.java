package Observer;

public class add extends Observer{
	public add(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	public void update() {
		System.out.println("Sum = "+(subject.getState()+subject.getState()));
	}

}
