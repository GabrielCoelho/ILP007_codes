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
}
