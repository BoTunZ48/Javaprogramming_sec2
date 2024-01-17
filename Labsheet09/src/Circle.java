
public class Circle {
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "blue";

	private double radius;
	private String color;
	
	Circle(){
	
	this.radius = DEFAULT_RADIUS;
	this.color = DEFAULT_COLOR;
	}
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
		
	}
	Circle(double radius,String color){
		this.radius = radius;
		this.color =color;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}


public String toString() {
	return "Circle[radus= "+this.radius+",color= "+color+"]";
}
public double getArea() {
	return Math.PI*Math.pow( radius,2);
}
public double getCircumference() {
	return 2.0 * Math.PI * radius;

}
}