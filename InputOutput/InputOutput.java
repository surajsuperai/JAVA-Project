package inputoutput;

import java.util.Scanner;
public class InputOutput {


    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input a number
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output the values
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        // Close scanner
        scanner.close();
    
}
}
