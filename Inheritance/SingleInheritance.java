class ClassA{
	public ClassA(){
		System.out.println("ClassA 1");
		System.out.println("ClassA 2");
		System.out.println("ClassA 3");
	}
}
class ClassB extends ClassA
{
	public ClassB(){
	System.out.println("ClassB 1");
	System.out.println("ClassB 2");
	System.out.println("ClassB 3");
}
}
public class SingleInheritance {
	
	public static void main(String[] args){
		ClassB classb = new ClassB();	
	}
}
