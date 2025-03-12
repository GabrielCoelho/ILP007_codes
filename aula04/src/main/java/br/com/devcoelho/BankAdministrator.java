package br.com.devcoelho;

import java.util.List;
import java.util.Scanner;

/** BankAdministrator */
public class BankAdministrator {
  private List<BankAccount> accountManaged;

  public void consultAccount() {
    if (!accountManaged.isEmpty()) {
      for (BankAccount account : accountManaged) {
        account.printInfo();
      }
    }
  }

  public boolean insertNewAccount() {
    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount();
    try {
      System.out.println("Inform the agency name: ");
      account.setAgencyName(sc.nextLine());
      System.out.println("Inform the full name of the client: ");
      account.setClientName(sc.nextLine());
      System.out.println("Inform the account number: ");
      account.setAccountNumber(sc.nextInt());
      sc.close();
    } catch (Exception e) {
      System.out.println("Caught an error: " + e);
      return false;
    }
    return true;
  }

  public boolean deleteAccount() {

    return false;
  }
}
