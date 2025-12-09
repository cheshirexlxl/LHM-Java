package mission16;

public class Rectangle extends Shape {
	double width, height;

	public Rectangle() {
		
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}	
	
	@Override
	double area() {		
		return width * height;	// 사각형 넓이
	}

	@Override
	double round() {		
		return (width + height) * 2;	// 사각형 둘레
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
		
}
