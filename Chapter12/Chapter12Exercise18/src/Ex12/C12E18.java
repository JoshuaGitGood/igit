package Chapter12Exercise18.src.Ex12;


import java.util.Scanner;

public class C12E18 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Processess p = new Processess();
        
        int ch = 0;
        p.addInitialdata();

        for (;;) {

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("[1] - display inventory");
            System.out.println("[2] - add items");
            System.out.println("[3] - discontinue an item");
            System.out.println("[4] - check amount of an item");
            System.out.println("[5] - Save Inventory to file");
            System.out.println("[99] - exit");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("CHOICE : ");
            ch = sc.nextInt();

            if (ch == 1) {
                p.displayInventory();
            }
            if (ch == 2) {
                System.out.print("Name :");
                String itemName = sc.next();
                System.out.print("Amount : ");
                int itemAmount = sc.nextInt();
                p.addItem(itemName, itemAmount);
            }
            if (ch == 3) {
                
                System.out.print("ID :");
                int id = sc.nextInt();
                p.discontinue(id);

            }
            if (ch == 4) {
                
                System.out.print("ID :");
                int id = sc.nextInt();
                p.checkItemAmount(id);

            }
            if(ch == 5){
                p.writeInventoryFile();
            }

            if (ch == 99) {
                break;
            }

        }
    }
}
