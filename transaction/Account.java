package transaction;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {

  private double balance;
  private ArrayList<Transaction> transitionList = new ArrayList<>();

  /**
   * dp.
   *
   * @param amount amount.
   */
  private void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("So tien ban nap vao khong hop le!");
    }
    balance += amount;
    Transaction transaction = new Transaction(Transaction.DEPOSIT, amount, balance);
    transitionList.add(transaction);
  }

  /**
   * w.
   *
   * @param amount wd.
   */
  private void withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("So tien ban rut ra khong hop le!");
    }
    if (amount > balance) {
      System.out.println("So tien ban rut vuot qua so du!");
    }
    balance -= amount;
    Transaction transaction = new Transaction(Transaction.WITHDRAW, amount, balance);
    transitionList.add(transaction);
  }

  /**
   * add.
   *
   * @param amount    add.
   * @param operation add.
   */
  public void addTransaction(double amount, String operation) {
    if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
      System.out.println("Yeu cau khong hop le!");
    } else if (operation.equals(Transaction.DEPOSIT)) {
      deposit(amount);
    } else {
      withdraw(amount);
    }
  }

  /**
   * print.
   */
  public void printTransaction() {
    DecimalFormat f = new DecimalFormat("##.00");
    for (int i = 0; i < transitionList.size(); i++) {
      if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
        System.out.println(
            "Giao dich " + (i + 1) + ": Nap tien $" + f.format(transitionList.get(i).getAmount())
                + ". So du luc nay: $" + f.format(transitionList.get(i).getBalance()) + ".");
      } else {
        System.out.println(
            "Giao dich " + (i + 1) + ": Rut tien $" + f.format(transitionList.get(i).getAmount())
                + ". So du luc nay: $" + f.format(transitionList.get(i).getBalance()) + ".");
      }
    }
  }

  public static void main(String[] args) {
    Account acc= new Account();
    acc.addTransaction(2000.255,"deposit");
    acc.addTransaction(1000,"withdraw");
    acc.printTransaction();
  }
}