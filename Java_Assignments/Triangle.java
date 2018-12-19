
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){

	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public boolean IsoscelesTriangle(int side1, int side2, int side3) {

		boolean flag = false;
		if((side1==side2 && side1!=side3) || (side1==side3 && side1!=side2) || (side3==side2 && side3!=side1))
			flag = true;
		return flag;
	}
	public boolean scaleneTriangle(int side1, int side2, int side3) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(side1!=side2 && side1!=side3 && side2!=side3)
			flag = true;
		return flag;
	
	}
	public boolean equilateralTriangle(int side1, int side2, int side3) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		if(side1==side2 && side1 == side3 && side2==side3)
			flag = true;
		return flag;
	}
	public boolean isRightTriangle(int side1, int side2, int side3) {
		boolean flag = false;
		if((side1*side1)+(side2*side2)==(side3*side3) || (side1*side1)+(side3*side3)==(side2*side2) || (side2*side2)+(side3*side3) == (side1*side1))
			flag = true;
		return flag;
	}	
}
	
	

