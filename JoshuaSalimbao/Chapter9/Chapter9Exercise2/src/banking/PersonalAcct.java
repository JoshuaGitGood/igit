import java.text.NumberFormat;

public class PersonalAcct extends Account {

    public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);
    }

    @Override
    void extraCharge() {
        super.setBalance(super.getBalance()-2);
        System.out.println("\nYou have been charge extra " + 2 + " for breaching minimun Balance ^UWWWUWWWWWUUUUU :>\n ");
        
    }

    @Override
    int minimum() {
        // TODO Auto-generated method stub
        return 100;
    }

    @Override
    public String showBal() {
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        return ("Current balance is " + money.format(super.getBalance()));
    }
    

    

}
