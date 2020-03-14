package Observer;

public class ObserverMain {
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer addOb = new add(subject);
		Observer biyogOb = new biyog(subject);
		
		subject.setState(10);
		subject.deattach(addOb);
		subject.setState(5);
		
	}

}
