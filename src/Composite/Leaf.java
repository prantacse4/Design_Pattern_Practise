package Composite;

public class Leaf implements Component {
	
	String name;
	int yours;
	
	public  Leaf(String name, int yours) {
	
		this.name = name;
		this.yours =yours;
		
	}
	public String getName() {
		return name;
	}
	public int getYours() {
		return yours;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setYours(int yours) {
		this.yours = yours;
	}
	
	public void showYours() {
		System.out.println(name+" : "+yours);
	}

}
