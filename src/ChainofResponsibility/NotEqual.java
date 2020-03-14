package ChainofResponsibility;

public class NotEqual implements Chain{
	private Chain nextChain;
	
	public void setNext(Chain nextChain) {
		this.nextChain = nextChain;
	}
	public void calculate(Number request) {
		if(request.getNum1()!=request.getNum2()) {
			System.out.println("Numebers are not Equal (Bolese -> Pranta)");
		}
		else {
			nextChain.calculate(request);
		}
	}

}
