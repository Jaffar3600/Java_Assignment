class Shape{
	public void draw(){
		System.out.println("Shape Class Draw Method");
	}
}
class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("Circle Class Draw Method");
	}
}
class Polygon extends Shape{
	@Override
	public void draw(){
	System.out.println("Polygon Class Draw Method");
}
}
class Rectangle extends Shape{
	@Override
	public void draw(){
	System.out.println("Rectangle Class Draw Method");
}
}
public class ShapeInheritance {
	
	public static void main(String[] args){
		Shape shape = new Rectangle();
		shape.draw();
		Shape shape1 = new Circle();
		shape.draw();
		Shape shape2 = new Shape();
		shape.draw();
	}
}

