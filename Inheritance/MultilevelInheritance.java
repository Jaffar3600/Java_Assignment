class A
{
	public A(){
		System.out.println("ClassA Constructor");
	}
}
class B extends A{
	public B(){
		System.out.println("ClassB constructor");
	}
}
class C extends B{
	public C(){
		System.out.println("ClassC Constructor");
	}
}

public class MultilevelInheritance {
public static void main(String[] args){
	C classc = new C();
}
}
