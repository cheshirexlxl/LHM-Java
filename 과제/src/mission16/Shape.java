package mission16;

// 추상 클래스
public abstract class Shape {
	
	Point point;

	abstract double area();		// 넓이
	abstract double round();	// 둘레
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}	
	
}
