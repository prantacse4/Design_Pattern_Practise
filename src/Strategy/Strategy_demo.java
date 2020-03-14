package Strategy;

public class Strategy_demo {
	public static void main(String[] args) {
		Context context = new Context(new Add());
		System.out.println("Sum = "+context.execute(10, 5));
	}
}
