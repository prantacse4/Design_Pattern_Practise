package Composite;
import java.util.*;
public class Composite implements Component{
	
	List<Component> components = new ArrayList<Component>();
	String name;
	
	public Composite(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void attach(Component component) {
		components.add(component);
	}
	public void deattach(Component component) {
		components.remove(component);
	}
	
	
	public void showYours() {
		System.out.println("Composite Name : "+name);
		for(Component component : components) {
			component.showYours();
		}
	}

}
