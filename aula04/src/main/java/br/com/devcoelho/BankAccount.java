package br.com.devcoelho;

/** BankAccount */
public class BankAccount {
  private String clientName;
  private int accountNumber;
  private String agencyName;
  private double currencyAmount;

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  public double getCurrencyAmount() {
    return currencyAmount;
  }

  public void setCurrencyAmount(double currencyAmount) {
    this.currencyAmount = currencyAmount;
  }

  public boolean withdrawValue(double value) {
    if (value > 0 && value <= getCurrencyAmount()) {
      setCurrencyAmount(getCurrencyAmount() - value);
      return true;
    }
    return false;
  }

  public boolean depositValue(double value) {
    if (value > 0) {
      setCurrencyAmount(getCurrencyAmount() + value);
      return true;
    }
    return false;
  }

  public void printInfo() {
    System.out.println("Account Number: " + getAccountNumber());
    System.out.println("Agency Name: " + getAgencyName());
    System.out.println("Client Name: " + getClientName());
    System.out.println("Amount Stored at account: $" + getCurrencyAmount());
  }

  public boolean isValid() {
    if (this.agencyName != null && this.clientName != null && this.accountNumber != 0) {
      return true;
    }
    return false;
  }
}
