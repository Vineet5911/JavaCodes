package oops;
public class abstraction {
	public static void main(String[] args) {
	}
}
class Audi extends car{
	@Override
	void start() {
		System.out.println("Audi is starting");
	}
}
class BMW extends car{
	@Override
	void start() {
		System.out.println("BMW is starting");
	}
}
abstract class car{
	int price;
	abstract void start();
}