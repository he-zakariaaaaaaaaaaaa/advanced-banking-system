package project00test;

import java.util.ArrayList;

public class BankSystem {

  private ArrayList<Bankacc> accounts = new ArrayList<>();

  public void addAccount(Bankacc account) {

    if (!existingCheck(account)) {

      accounts.add(account);
    } else {

      System.out.println("Account already exists!");
    }
  }

  public boolean existingCheck(Bankacc curAccount) {

    int tempX = curAccount.getAccNumber();

    for (Bankacc account : accounts) {

      int tempY = account.getAccNumber();

      if (tempX == account.getAccNumber()) {
        return true;
      }
    }
    return false;
  }

  public Bankacc findAccount(int accNumber) {

    for (int i = 0; i < accounts.size(); i++) {

      int temp = accounts.get(i).getAccNumber();

      if (accNumber == temp) {

        return accounts.get(i);
      }
    }
    return null;
  }

  public boolean removeAccount(int accNumber) {

    Bankacc account = findAccount(accNumber);

    if (account == null) {

      return false;
    } else {

      accounts.remove(account);
      return true;
    }
  }

  public void displayAllAccounts() {

    if (accounts.size() > 0) {

      for (int i = 0; i < accounts.size(); i++) {

        accounts.get(i).accInfos();
      }
    } else {

      System.out.println("No account found!");
    }
  }

  public boolean checkBalance(int accNumber) {

    Bankacc account = findAccount(accNumber);

    if (account == null) {

      return false;
    } else {
      if (account.getBalance() >= 0) {

        return true;
      } else {

        return false;
      }
    }
  }
}
