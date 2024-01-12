package bank;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestAccount {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        Account account = new Account(1122, 20_000, formater.parse("2024-01-10"));
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Баланс равен " + account.getBalance() + " руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
        System.out.println("Этот счет был создан " + account.getDateCreated());

    }
}
