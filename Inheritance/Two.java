class First
{
	private int a=100;
	private int b=300;
	public void method1(){
		System.out.println("First class method1");
		System.out.println(a);
		System.out.println(b);
	}
	public void method2(){
		System.out.println("First class method2");
		System.out.println(a);
		System.out.println(b);
	}
}
class Second 
{
	private int a=200;
	private int b=400;
	public void method1(){
		System.out.println("Second Class method1");
		System.out.println(a);
		System.out.println(b);
	}
	public void method2(){
		System.out.println("Second Class method2");
		System.out.println(a);
		System.out.println(b);
	}

}
class Two
{
	public static void main(String[] args){
	First first = new First();
	first.method1();
	first.method2();
	System.out.println("---------------------------------------------");
	Second second = new Second();
	second.method1();
	second.method2();
	
}
}