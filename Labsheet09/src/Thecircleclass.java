
public class  {
	Circle c1 = new Circle(1.1,"blue");
	System.out.println(c1);
	Circle c2 = new Circle(2.2);
	System.out.println(c2);
	Circle c3 = new Circle(2.2);
	System.out.println(c2);

}

public String toString() {
	return "Circle[radus= "+this.radius+",color= "+color+"];
}
public double getArea() {
	return Math.PI*Math.pow( radius,2);
}
public double getCircumference() {
	return 2.0 * Math.PI * radius;
}