// package MySavings.src.savings;
import java.util.Scanner;
public class C8E1 {
    public static void main(String[] args) throws Exception {
        
        // Methods m = new Methods();
        // m.process();

        PiggyBank pig = new PiggyBank();

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {

            System.out.println("1. Show total in bank.");
            System.out.println("2. Add A penny.");
            System.out.println("3. Add A nickel.");
            System.out.println("4. Add A dime.");
            System.out.println("5. Add A quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                   
                    System.out.println(pig.toString());

                    break;
                case 2:
                    
                    pig.addPenny();
                    System.out.println("\nADDED A PENNY\n");
                    

                    break;
                case 3:
                   
                    pig.addNickel();
                    System.out.println("\nADDED A NICKEL \n");
                    
                    break;
                case 4:
               
                    pig.addDime();
                    System.out.println("\nADDED A DIME \n");
                  
                    break;
                case 5:
                    
                    
                    pig.addQuarter();
                    System.out.println("\nADDED A QUARTER \n");
                 
                    break;
                case 6:
                   
                    pig.emptyPiggy();
                    System.out.println("No Coin left. ");
              
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
