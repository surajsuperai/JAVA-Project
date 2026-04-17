package welcomeback.firstprogram;

// https://www.w3schools.com/java/java_data_types.asp
import java.util.Scanner;

public class Primitives {

    public static void main(String[] args)
    {

    int rollno = 64;
    char letter = 'r';
    float marks = 98.67f;
    double largeDecimalNumbers = 72346778.98;
    long largeIntegerValue =  86512412414216L;
    boolean check = false;

    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    int sum = num1+num2;

    System.out.println("Sum ="+ sum);

    }
    
}
