package oops;
public class encapsulation {
	public static void main(String[] args) {
	}
	//private class is a class which can't be aceesed by any other class outside this class 
	private void doWork() {

		System.out.println("working working");
	}
    //public class is a class which can be accessed by any class outside this class or in this class also
	public void thisClass() {

		System.out.println("hello");
	}
	//now by this protected keyword this class can only be accessed by its child class
	class Person {
		protected String name;
		int age;
	}
}
