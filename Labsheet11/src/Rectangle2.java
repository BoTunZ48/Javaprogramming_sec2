//interface Class
public class Rectangle2 implements Shape2{
	private double width;
	private double length;
	
	Rectangle2(double width, double length){
	 //call attribute color from Constructor method in class shape
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return this.length*this.width;
	}
	public String toString() {
		return "Rectangle[width = "+this.width+",length= "+this.length+"]";
	}

}
