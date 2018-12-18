class Parent{
	public void display(int a){
		System.out.println("Parent class Method");
	}
}

class Child extends Parent{
	public void display(){
		System.out.println("Child class Method");
	}
}

public class FunctionOverriding {
	public static void main(String[] args){
		Child child = new Child();
		child.display();
		child.display(10);
	}
}
