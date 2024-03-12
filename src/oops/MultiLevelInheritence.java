package oops;
class She{
	public void area() {
		System.out.println("displays area");
	}
}
class Triang extends She{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
class EquilateralTriangle extends Triangles{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
public class MultiLevelInheritence {
	public static void main(String[] args) {
	}
}