class Parent{
	public void display(){
		System.out.println("Parent class Method");
	}
}

class Child extends Parent{
	public void display(){
		System.out.println("Child class Method");
	}
}
public class MethodOverriding {
	public static void main(String[] args){
		Child child = new Child();
		child.display();
}
}
