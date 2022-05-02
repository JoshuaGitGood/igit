import java.util.Scanner;

public class Client {

    Account acc;
    Scanner sc = new Scanner(System.in);

    public void showBalance(Account acc) {
        this.acc = acc;
        System.out.println("\n\nBALANCE : " + acc.getBalance()+ "\n");
        // acc.showBal();
    }

    public void withdrawMoney(Account acc) {
        
        this.acc = acc;
        System.out.print("AMOUNT  : ");
        double amntw = sc.nextDouble();
        acc.withdrawal(amntw);

        
        if(acc.getBalance() < acc.minimum()){
            acc.extraCharge();
        }
        
        
    }

    public void depositMoney(Account acc){
   
        this.acc = acc;
        System.out.print("AMOUNT  : ");
        double amntw = sc.nextDouble();
        acc.deposit(amntw);
       
    }

}
