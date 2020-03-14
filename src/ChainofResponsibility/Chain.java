package ChainofResponsibility;

public interface Chain {
	public void setNext(Chain nextChain);
	public void calculate(Number request);

}
