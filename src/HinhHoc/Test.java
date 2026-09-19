package HinhHoc;
public class Test {
	public static void main(String[]args) {
		Triangle t = new Triangle("Triangle", 10, 5);

		System.out.println(t.getArea());
		
		Circle c = new Circle("Circle", 5);

		System.out.println(c.getArea());
	}
}
