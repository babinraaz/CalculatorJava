import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String exit = "y";
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nChoose your option:");
            System.out.println("\n 1. Add");
            System.out.println("\n 2. Subtract");
            
            System.out.println("Press '1' or '2' to perform opertation");
            String operation = scan.next();

            if (operation.equals("1")){
                add();
            }

            else if (operation.equals("2")){
                sub();
            }
            else{
                System.out.println("You are out of range!!");

            }
	    System.out.println("\nDo you want to continue? (y/n)");
            exit=scan.next();
        
        }while(exit.equals("y"));
                

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

    public static void sub() {
        double n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSub");

        System.out.println("\nFirst Number: ");
        n1 = scan.nextDouble();

        System.out.println("\nSecond Number: ");
        n2 = scan.nextDouble();
        
        System.out.println("\nSub: " + n1 + " - " + n2 + " = " + (n1 - n2));
        
    }

}