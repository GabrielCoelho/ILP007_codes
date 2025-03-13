package br.com.devcoelho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** BankAdministrator */
public class BankAdministrator {
  private List<BankAccount> accountManaged = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  public void consultAccount() {
    if (!accountManaged.isEmpty()) {
      for (BankAccount account : accountManaged) {
        account.printInfo();
      }
    }
  }

  public boolean insertNewAccount() {
    BankAccount account = new BankAccount();
    try {
      System.out.println("Inform the agency name: ");
      account.setAgencyName(sc.nextLine());
      System.out.println("Inform the full name of the client: ");
      account.setClientName(sc.nextLine());
      System.out.println("Inform the account number: ");
      account.setAccountNumber(sc.nextInt());
    } catch (Exception e) {
      System.out.println("Caught an error: " + e);
      return false;
    }
    accountManaged.add(account);
    return true;
  }

  public boolean deleteAccount() {
    System.out.println("Inform the account to be deleted: ");
    int accountNumberChecked = sc.nextInt();
    BankAccount account = new BankAccount();
    for (BankAccount bankAccount : accountManaged) {
      if (accountNumberChecked == bankAccount.getAccountNumber()) {
        account = bankAccount;
      }
    }
    if (accountManaged.contains(account)) {
      accountManaged.remove(account);
      return true;
    }

    return false;
  }

  public void manageAccount() {
    System.out.println("Please inform the number account to be managed: ");
    int accountNumberChecked = sc.nextInt();
    BankAccount account = new BankAccount();
    for (BankAccount bankAccount : accountManaged) {
      if (accountNumberChecked == bankAccount.getAccountNumber()) {
        account = bankAccount;
      }
    }
    if (account.isValid()) {
      int option = 0;
      do {
        System.out.println("Account Management Screen");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Show Account");
        System.out.println("0. Exit");
        switch (option) {
          case 1:
            System.out.println("Insert the amount to Withdraw: ");
            account.withdrawValue(sc.nextDouble());
            break;
          case 2:
            System.out.println("Insert the amount to Deposit: ");
            account.depositValue(sc.nextDouble());
            break;
          case 3:
            account.printInfo();
            break;
          case 0:
            break;

          default:
            System.out.println("There's no such option.\nTry again");
            break;
        }
      } while (option != 0);
    } else {
      System.out.println("Couldn't find this account.\n");
    }

  }
}
