package bank;
import java.util.Scanner;
import java.util.logging.Logger;

public class Bank {

    public void bankMain()  {
        Logger log = Logger.getLogger("Bank");
        Scanner sc = new Scanner(System.in);

        log.info("Enter Name:");
        String name = sc.nextLine();

        log.info("Enter Account Number:");
        int accountnum = sc.nextInt();

        BankLogic obj = new BankLogic(name, accountnum);
        Boolean loopend = true;
        int operation1 = 0;
        while (Boolean.TRUE.equals(loopend)) {

            log.info("Deposit(1), Withdraw(2), Show balance(3), Cancel(4). Enter Your Choice :");
            try {

                operation1 = sc.nextInt();
            } catch (Exception e) {

                log.info(String.valueOf(e));
                loopend=false;

            }
            switch (operation1) {

            case 1:
                try {
                    log.info("Enter The Amount To Deposit:");

                    double depositamount = sc.nextDouble();
                    obj.deposit(depositamount);
                } catch (Exception e) {
                    log.info(String.valueOf(e));
                    loopend = false;
                }
                break;

            case 2:
                try {
                    log.info("Enter The Amount You Want to Withdraw:");
                    double withdrawamount = sc.nextDouble();
                    obj.withdrawal(withdrawamount);
                } catch (Exception e) {
                    log.info(String.valueOf(e));
                    loopend = false;
                }
                break;

            case 3:
                obj.showbalance();
                break;

            case 4:
                log.info("Your Transation Cancelled ");
                loopend = false;
                break;
            default:
                log.info("Choose correct option");

            }
        }

    }

}
