import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		// TODO Calculation
		String exit = "y";
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nChoose your option:");
            System.out.println("\n 1. Add");
            System.out.println("\n 2. Subtract");
            
            System.out.println("Press '1' or '2' to perform opertation");
            String operation = scan.next();

            if (operation.equals("1")){
                addition.add();
            }

            else if (operation.equals("2")){
                subtraction.subtract();
            }
            else{
                System.out.println("You are out of range!!");

            }
	    System.out.println("\nDo you want to continue? (y/n)");
            exit=scan.next();
        
        }while(exit.equals("y"));

	}

}
