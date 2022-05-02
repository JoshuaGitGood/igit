import java.util.Scanner;

public class C9E2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Client client = new Client();
        Account personal, business;
        business = defineBusinessAccount();
        personal = definePersonalAccount();
        int ch;
        
   
        do {

            System.out.println("******************************BANKO*NI*NINO********************************");
            System.out.println("[1] - Display Balance");
            System.out.println("[2] - Deposit");
            System.out.println("[3] - Withdraw");
            System.out.println("[99] - Exit");
            System.out.println("***************************************************************************");

            ch = sc.nextInt();
            int chooseAccount;

            switch (ch) {
                case 1:
                    chooseAccount();
                    chooseAccount = sc.nextInt();
                    if (chooseAccount == 1) {
                        client.showBalance(personal);
                        // client.toString();
                    } else if (chooseAccount == 2) {
                        client.showBalance(business);
                    } else {
                        System.out.println("OUTPUT ERROR!");
                    }
                    break;
                case 2:

                    chooseAccount();
                    chooseAccount = sc.nextInt();
                    if (chooseAccount == 1) {
                        client.depositMoney(personal);
                    } else if (chooseAccount == 2) {
                        client.depositMoney(business);
                    } else {
                        System.out.println("OUTPUT ERROR!");
                    }

                    break;
                case 3:

                    chooseAccount();
                    chooseAccount = sc.nextInt();
                    if (chooseAccount == 1) {
                        client.withdrawMoney(personal);
                    } else if (chooseAccount == 2) {
                        client.withdrawMoney(business);
                    } else {
                        System.out.println("OUTPUT ERROR!");
                    }
                    break;

                default:
                    break;
            }
            
            
        } while (ch != 99);
    
        
       
    }
    

    public static void chooseAccount() {
        System.out.print("Which Account ? : ");
        System.out.print("\n [1] - PERSONAL ACCOUNT \n [2] - BUSINESS ACCOUNT \n Choice : ");
    }

    // STATIC BECAUSE THIS A PART OF MAIN (USER GUI, MACHINE, CALCULATOR ETC. ETC)
    public static Account definePersonalAccount() {

        /// IF EXISTS
        return (new PersonalAcct(3500, "Joshua", "Salimbao", "MALAGASANG 1-G", "CAVIRE", "PH", "4103"));

    }

    // STATIC BECAUSE THIS A PART OF MAIN (USER GUI, MACHINE, CALCULATOR ETC. ETC)
    public static Account defineBusinessAccount() {

        /// IF EXISTS
        return (new BusinessAcct(25000, "Joshua", "Salimbao", "MALAGASANG 1-G", "CAVIRE", "PH", "4103"));
    }
}
