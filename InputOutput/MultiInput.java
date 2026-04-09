package InputOutput;
import java.util.Scanner;

public class MultiInput {

public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input an integer
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();

        // Input a byte
        System.out.print("Enter your age (byte): ");
        byte age = scanner.nextByte();

        // Input a character
        System.out.print("Enter your grade (char): ");
        char grade = scanner.next().charAt(0);

        // Input a float
        System.out.print("Enter your marks (float): ");
        float marks = scanner.nextFloat();

        // Output all values
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);

        // Close scanner
        scanner.close();
    }


}
