abstract class Account {

    private double balance;
    // private Customer cust;

    /**
     * constructor
     * pre: none
     * post: An account created. Balance and
     * customer data initialized with parameters.
     */
    public Account(double bal, String fName, String lName,
            String str, String city, String st, String zip) {
        balance = bal;

    }

    public double getBalance() {
        return (balance);
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("\nYou Successfully Deposit : " + amt + "\n");
    }

    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("\nYou Successfully Withdrew : " + amt);
        } else {
            System.out.println("\nNot enough money in account." + "\n");
        }
    }

    abstract void extraCharge();

    abstract int minimum();

    public abstract String showBal();

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
