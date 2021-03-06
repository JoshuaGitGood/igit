import java.util.ArrayList;

public class Processess {
    ArrayList<Items> itemList = new ArrayList<Items>();

    public void addInitialdata() {
        itemList.add(new Items(1000, "TAYD", 200));
        itemList.add(new Items(1001, "SARF", 800));
        itemList.add(new Items(1002, "DAWNY", 100));
    }

    public void displayInventory() {
        System.out.println("\n**********************INVENTORY***********************");
        System.out.println("------------------------------------------------------");
        System.out.println(String.format("|%-10s |%-15s |%-10s", "ID", "ITEM", "AMOUNT"));
        for (Items listIt : itemList) {
            System.out.println(String.format("|%-10s |%-15s |%-10s", listIt.getEntry(), listIt.getName(),
                    listIt.getAmount()));
        }
        System.out.println("******************************************************");
    }

    public void addItem(String itemName, int itemAmount) {
        

        int ent = 0;
        for (Items itemL : itemList) {
            ent = itemL.getEntry() + 1;
        }
        itemList.add(new Items(ent, itemName, itemAmount));

    }
    public void discontinue(int id){
        Boolean exist = false;
        Items toEdit = null;

                for (Items ed : itemList) {
                    if (id == ed.getEntry()) {
                        exist = true;
                        toEdit = ed;
                    }
                }
                if (exist == true) {
                    toEdit.setAmount(0);
                    toEdit.setName("discontinued");
                    System.out.println("\n\n\nITEM WITH ID " + id + " has been Discontinued.");
                } else {
                    System.out.println("\n\n\nITEM WITH ID " + id + " does not exist!.");
                }

    }
    public void checkItemAmount(int id){
        Boolean exist = false;
        Items toCheck = null;

                for (Items ed : itemList) {
                    if (id == ed.getEntry()) {
                        exist = true;
                        toCheck = ed;
                    }
                }
                if (exist == true) {
                    System.out.println("\n\n\nITEM WITH ID " + toCheck.getEntry() + "(" + toCheck.getName() + ")"
                            + " has an amount of " + toCheck.getAmount());
                } else {
                    System.out.println("\n\n\nITEM WITH ID " + id + " does not exist!.");
                }
    }

}
