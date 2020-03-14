package Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		 this.strategy = strategy;
	}
	
	public int execute(int num1, int num2) {
		return strategy.Operation(num1, num2);
	}

}
