//import java.lang.Math;

public class Triangle extends GeometricObject{
	double side1;
	double side2;
	double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	@Override
	public double getArea() {
		double s = this.getPerimeter()/2;
		double a = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		return a;
	}

	@Override
	public double getPerimeter() {
		double p = side1 + side2 + side3;
		return p;
	}
	
	public String toString(){
		return "this is a triangle object.";
	}
	
}
