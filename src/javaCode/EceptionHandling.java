package javaCode;

public class EceptionHandling {
	public static void main(String[] args) {

		int[] numbers = {12,43,46,22,32};
		try {
		System.out.println(numbers[6]);
		} catch(Exception e) {
			System.out.println("Error aaya tha");
			System.out.println(e.getLocalizedMessage());
		}
		finally {
			System.out.println("niche ki line");
		      }
		}
}