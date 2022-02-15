import java.util.Scanner;

public class Addition {
	public Addition(){
		
	}
	
	public static void add() {
        double n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nAdd");

        System.out.println("\nFirst Number: ");
        n1 = scan.nextDouble();

        System.out.println("\nSecond Number: ");
        n2 = scan.nextDouble();
        
        System.out.println("\nSum: " + n1 + " + " + n2 + " = " + (n1 + n2));
        
    }

}
