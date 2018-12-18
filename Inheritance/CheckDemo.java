
class Check {
	int a = 100;
	private int b = 200;
	public int c = 300;
	protected int d = 400;
	
	public void disp(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
public class CheckDemo{
	public static void main(String[] args){
	Check check = new Check();
	check.disp();
	}
	
}
