package Observer;

public class biyog extends Observer {
	
	public biyog(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	public void update() {
		System.out.println("Biyogfol = "+(subject.getState()-subject.getState()));
	}

}
