package Chapter12Exercise18.src.Ex12;

public class Items {
    private int entry;
    private String name;
    private int amount;

    public Items(int entry, String name, int amount){
        this.entry = entry;
        this.name = name;
        this.amount = amount;
    }


    /**
     * @return int return the entry
     */
    public int getEntry() {
        return entry;
    }

    /**
     * @param entry the entry to set
     */
    public void setEntry(int entry) {
        this.entry = entry;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
