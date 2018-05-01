package question;

class Circle{
	private double  radius;
	public double getRadius(){
		return radius;
	}
	public void setRadius(double  d) {
		radius = d;
	}
	public Circle(double  d){
		radius = d;
	}
	public double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}
}

class Square{
	private int sides;
	public int getSides(){
		return sides;
	}
	public void setSides(int s) {
		sides = s;
	}
	public Square(int i){
		sides =i;
	}
	public int getArea() {
		int area = sides * sides;
		return area;
	}
}

class Cylinder{
//	double bottom;
//	Circle c;
//	void setCircle(Circle c) {
//		bottom = c.getArea();
//	}
//	private int height;
//	public Cylinder(int i) {
//		int height = i;
//	}
//	public int getHeight() {
//		return height;
//	}
//	public void setHeight(int i) {
//		int height = i;
//	}
//	public double getVolume() {
//		double volume = bottom * height;
//		return volume;
//	}
	//円柱の体積 ＝　底面積(Circle)*高さ

	private int height;
	private Circle circle;
	public Cylinder(int h, Circle c) {
		height = h;
		circle = c;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle c) {
		circle = c;
	}
	public double getVolume() {
		return circle.getArea() * height;
	}
}

public class FigureMain {
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		System.out.println(c1.getArea());

		Square s1 = new Square(10);
		System.out.println(s1.getArea());

		Circle circle = new Circle(5.0);
		Cylinder c2 = new Cylinder(5, circle);
		System.out.println(c2.getVolume());
	}
}
