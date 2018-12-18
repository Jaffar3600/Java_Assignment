class Test{
	static int a = 100;
	static int b = 200;
	private int c = 300;
	private int d = 400;

	public void method1(){
	System.out.println("Test Class non-static method1");
	System.out.println(Test.a);
	System.out.println(Test.b);
	System.out.println(c);
	System.out.println(d);
	}
	public static void method2(){
	System.out.println("Test Class static method2");
	Test test = new Test();
	System.out.println(a);
	System.out.println(b);
	System.out.println(test.c);
	System.out.println(test.d);
}
public static void main(String[] args){
	Test test = new Test();
	test.method1();
	System.out.println("--------------------------");
	test.method2();
}
	
}