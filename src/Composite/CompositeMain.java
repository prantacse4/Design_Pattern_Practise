package Composite;

public class CompositeMain {
	
	public static void main(String[] args) {
		Component academic = new Leaf("Algorithm",50);
		Component nonacademic = new Leaf("Accounting",100);
		Composite book = new Composite("Book");
		book.attach(academic);
		book.attach(nonacademic);
		book.showYours();
		
	}

}
