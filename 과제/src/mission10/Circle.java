package mission10;

public class Circle {
	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		// 원의 넓이 = (원주율) x (반지름) x (반지름)
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
