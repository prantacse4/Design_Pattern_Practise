package ChainofResponsibility;

public class Equal implements Chain {
	
	private Chain nextChain;
	public void setNext(Chain nextChain) {
		this.nextChain = nextChain;
	}
	
	public void calculate(Number request) {
		if(request.getNum1()==request.getNum2()) {
			System.out.println("Number are Equal (boleche -> Pranta)");
		}
		else {
			nextChain.calculate(request);
		}
	}

}
