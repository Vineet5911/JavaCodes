package oops;
class Student{
	String name;
	int age;
   public void printInfo() {
	   System.out.println(this.name);
	   System.out.println(this.age);
   }
   Student ( String name, int age){
	   this.name = name;
	   this.age = age;
   }
}
public class Constructors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("aman", 24);
		s1.printInfo();
	}
}
