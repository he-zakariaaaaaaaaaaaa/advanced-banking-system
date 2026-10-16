package project00test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String accName = input.nextLine();

    System.out.print("Enter your account number: ");
    int accNum = input.nextInt();

    System.out.print("Enter your balance: ");
    double accBalance = input.nextDouble();

    Bankacc account = new Bankacc(accName, accNum, accBalance);

    int choise;
    do {

      System.out.println("Hello, " + accName);
      System.out.println("Choose an operation: ");

      System.out.println("1: Deposit money.");
      System.out.println("2: Withdraw money.");
      System.out.println("3: Display the balance.");
      System.out.println("0: exit.");

      choise = input.nextInt();

      switch (choise) {
        case 1:
          System.out.print("Enter the amount to deposit: ");
          double accAmount = input.nextDouble();

          account.deposit(accAmount);
          break;

        case 2:
          System.out.print("Enter the amount to Withdraw: ");
          double amount = input.nextDouble();

          account.withdrawal(amount);
          break;

        case 3:
          System.out.println("Current baance: " + account.getBalance());
          break;

        case 0:
          break;

        default:
          System.out.println("Invalid choice!");
          break;
      }

    } while (choise != 0);

    input.close();
  }
}
