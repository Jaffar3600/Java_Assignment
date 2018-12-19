
public class Rectangle {
	private double length;
	private double breadth;

	public Rectangle(int length, int breadth) {
		this.breadth=breadth;
		this.length=length;
	}
	
	
	//Finding Area Of Rectangle
	public double areaOfRectangle() {
		// TODO Auto-generated method stub
		double areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}
	

	public boolean comparingAreaOfRectangle(Rectangle rectangle,Rectangle rectangle2) {
		boolean result = false;
		if(rectangle.areaOfRectangle() == rectangle2.areaOfRectangle())
			return true;
		else
		    return result;
	}
}
