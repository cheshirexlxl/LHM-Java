package mission10;

public class Main {
	public static void main(String[] args) {
		 Triangle triangle = new Triangle(10, 20);
		 Rectangle ractangle = new Rectangle(10, 20);
		 Circle circle = new Circle(5);
		 Trapezoid trapezoid = new Trapezoid(5, 10, 8);
		 System.out.println("삼각형의넓이: " + triangle.getArea());
		 System.out.println("사각형의넓이: " + ractangle.getArea());
		 System.out.println("원형의넓이: " + circle.getArea());
		 System.out.println("사다리꼴의넓이: " + trapezoid.getArea());
	}
}
