import java.util.Scanner;

public class Subtraction {
	public Subtraction() {
		
	}
	public static void subtract(){
        Double nOne, nTwo;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSubtraction");

        System.out.println("\nFirst Number: ");
        nOne = scan.nextDouble();

        System.out.println("\nSecond Number: ");
        nTwo = scan.nextDouble();

        System.out.println("\nSubtract: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
   
    }

}
