import model.entities.Account;
import model.exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    try {
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();
        Account acc =  new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount to withdraw: ");
        Double amount = sc.nextDouble();
        acc.withdraw(amount);
    }
    catch (InputMismatchException | AccountException e) {
        System.out.println("Invalid input");
    }


        sc.close();
    }
}