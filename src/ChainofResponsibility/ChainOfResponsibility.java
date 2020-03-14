package ChainofResponsibility;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		Chain c1 = new Equal();
		Chain c2 = new NotEqual();
		 c1.setNext(c2);
		 
		 Number num = new Number(4,5);
		 c1.calculate(num);

	}

}
