package project00test;

class Bankacc {

  private String owenerName;
  private int accNumber;
  private double balance;

  public Bankacc(String owenerName, int accNumber, double balance) {
    this.owenerName = owenerName;
    this.accNumber = accNumber;
    if (balance >= 0) {
      this.balance = balance;
    } else {
      throw new IllegalArgumentException("Invalid balance!");
    }
  }

  public int getAccNumber() {
    return accNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getOwenerName() {
    return owenerName;
  }

  public void deposit(double depositAmount) {
    if (depositAmount <= 0) {
      System.out.println("Error! Deposit amount must be greater than zero!");
    } else {
      balance += depositAmount;
      System.out.println("Deposit successfull!");
    }
  }

  public void withdrawal(double withdrawalAmount) {
    if (withdrawalAmount <= 0) {
      System.out.println("Error! Invalid amount!");
    } else if (withdrawalAmount > balance) {
      System.out.println("Error! Insufficient balance!");
    } else {
      balance -= withdrawalAmount;
      System.out.println("withdrawal successfull!");
    }
  }

  public void accInfos() {
    System.out.println("Name: " + owenerName);
    System.out.println("Account number: " + accNumber);
    System.out.println("Balance: " + balance + "$");
  }
}
