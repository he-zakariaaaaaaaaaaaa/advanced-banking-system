package project00test;

public class TestBankSystem {

  public static void main(String[] args) {

    BankSystem bank = new BankSystem();

    Bankacc acc01 = new Bankacc("Zakaria", 001, 100);
    Bankacc acc02 = new Bankacc("Hedjazi", 002, 199);

    bank.addAccount(acc01);
    bank.addAccount(acc02);

    Bankacc acc03 = new Bankacc("zak", 001, 999);
    bank.addAccount(acc03);

    Bankacc result = bank.findAccount(001);
    if (result != null) {

      System.out.println(result.getOwenerName());
    }

    boolean removed = bank.removeAccount(001);
    if (removed) {
      System.out.println("Account removed successfully!");
    }

    Bankacc Result = bank.findAccount(001);
    if (Result == null) {
      System.out.println("Account not found after removal!");
    } else {
      System.out.println(Result.getOwenerName());
    }

    int temp = acc01.getAccNumber();
    System.out.println(bank.checkBalance(temp));

    System.out.println(bank.checkBalance(999));

    bank.displayAllAccounts();
  }
}
