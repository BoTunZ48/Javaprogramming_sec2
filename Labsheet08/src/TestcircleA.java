import java.text.DecimalFormat;

public class TestcircleA {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.##");
		CircleA c1 = new CircleA();
		CircleA c2 = new CircleA();
		CircleA c3 = new CircleA();
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		
		System.out.print("Circle c1 area is "+ frm.format(c1.getArea()));
		System.out.println(", and color is "+c1.getColor());
		
		c2.setRadius(2.0);
		c2.setColor("red");
		
		System.out.print("Circle c2 area is "+ frm.format(c2.getArea()));
		System.out.println(", and color is "+c2.getColor());
		
		c3.setRadius(1.0);
		c3.setColor("red");
		
		System.out.print("Circle c3 area is "+ frm.format(c3.getArea()));
		

	}

}
