class A
{
	public A(){
	System.out.println("A class constructor");
	}
}
class B extends A{
	public B(){
		System.out.println("B class Constructor");
	}
}
class C extends A{
	public C(){
		System.out.println("C class Constructor");
	}
}


public class HierarchicalInheritance {
	public static void main(String[] args){
	B a = new B();
	C c = new C();
}
}
