package bank;
import java.util.logging.Logger;

public class BankLogic {
    private String name;
    private int accountnum;
    private double balance = 0;
    Logger log = Logger.getLogger("CreditCard");

    BankLogic(String name, int accountnum) {
        this.name = name;
        this.accountnum = accountnum;
    }

    void deposit(double depositamount) {
        balance += depositamount;
        log.info("Successfully Deposited!!!");
    }

    void withdrawal(double withdrawalamount) {
        if (withdrawalamount <= balance) {
            balance -= withdrawalamount;
            log.info("Withdrawal Completed");
        } else {
            log.info("Insufficient Balance");
        }
    }

    void showbalance() {
        log.fine("Name {} AccountNumber {} balance {}" , name , accountnum ,balance);

    }

}
