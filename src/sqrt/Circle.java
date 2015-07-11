package sqrt;

public class Circle {
	double area;
	Circle(double area) {
		this.area = area;
	}
	
	public double getRadius() {
		assert area>=0; // prcod.
		return Sqrt.sqrt(area/Math.PI);
	}

}
