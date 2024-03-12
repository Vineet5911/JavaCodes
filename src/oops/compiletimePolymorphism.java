package oops;
class Boy {
	String name;
	int age;
	public void printInfo(String name) {

		System.out.println(name);
	}
	public void printInfo(int age) {

		System.out.println(age);
	}
	public void printInfo(String name, int age) {

		System.out.println(name + " "+ age);
	}
}
public class compiletimePolymorphism {
	public static void main(String[] args) {
		 Boy s1 = new Boy();
		 s1.name = "vineet";
		 s1.age = 18;
		s1.printInfo(s1.name);
	}
}
