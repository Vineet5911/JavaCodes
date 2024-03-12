package oops;
public class dataHidingEncapsulation {
	public static void main(String[] args) {
    Laptop l1 = new Laptop();
    l1.setPrice(23);
	}
}
class Laptop {
	int ram;
	private int price;
	public void setPrice (int price) {
		//is the user an admin
		boolean isAdmin = false;
		if(!isAdmin) {
			System.out.println("you are not the admin");
		}else {
			this.price = price;
		}
	}
}
