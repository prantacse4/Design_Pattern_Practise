package Singleton;

public class Singleton {
	private static Singleton single = new Singleton();
	private Singleton() {}
	public static Singleton EktaInstance() {
		return single;
	}
	void show() {
		System.out.println("Hi I am Pranta");
	}

}
