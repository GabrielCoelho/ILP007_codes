package br.com.devcoelho;

import java.util.Scanner;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    BankAdministrator manager = new BankAdministrator();
    App appMain = new App();
    Scanner sc = new Scanner(System.in);
    int option = 0;
    do {
      appMain.appMenu();
      option = Integer.valueOf(sc.nextLine());
      switch (option) {
        case 1:
          if (!manager.insertNewAccount()) {
            System.out.println("Account couldn't be created.\nTry again!");
          }
          break;
        case 2:
          manager.manageAccount();
          break;
        case 3:
          if (!manager.deleteAccount()) {
            System.out.println("There isn't any account active with that number.");
          }
          break;
        case 4:
          manager.consultAccount();
          break;
        case 0:
          break;
        default:
          System.out.println("Option doesn't exists");
          break;
      }

    } while (option != 0);
    sc.close();
  }

  public void appMenu() {
    System.out.println("Bank Management System");
    System.out.println("1. Create Account");
    System.out.println("2. Manage Account");
    System.out.println("3. Remove Account");
    System.out.println("4. Show Account");
    System.out.println("0. Exit");
  }
}
