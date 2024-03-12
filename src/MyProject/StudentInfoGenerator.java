package MyProject;

import java.util.Random;
import java.util.Scanner;

public class StudentInfoGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Student Info Generator");
        System.out.print("Enter student's enrollment number: ");
        String enrollmentNumber = scanner.nextLine();

        String name = generateRandomName();
        double cgpa = 5.0 + random.nextDouble();
        String division = generateDivision(cgpa);
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Division: " + division);

        scanner.close();
    }
    private static String generateRandomName() {
        String[] names = {"John", "Alice", "Bob", "Emily", "David"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
    private static String generateDivision(double cgpa) {
        if (cgpa >= 9.0) {
            return "Distinction";
        } else if (cgpa >= 7.0) {
            return "First Division";
        } else if (cgpa >= 5.0) {
            return "Second Division";
        } else {
            return "Fail";
        }
    }
}
