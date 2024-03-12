package oops;
class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("write something");
	}
	public void printInfo() {
		System.out.println(this.color);
	    System.out.println(this.type);
	}
}
public class ClassesAndObjects {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "ball pen";
		pen1.write();
		pen1.printInfo();
		System.out.println(pen1.color);
	}
}
