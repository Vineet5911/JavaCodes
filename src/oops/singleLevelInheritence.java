package oops;
class Shapes{
	public void area() {
		System.out.println("displays area");
	}
}
class Triangles extends Shapes{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
public class singleLevelInheritence {
	public static void main(String[] args) {
	}
}