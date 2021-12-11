package bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

  public static final String CHECKING = "CHECKING";
  public static final String SAVINGS = "SAVINGS";
  private long accountNumber;
  private double balance;
  protected List<Transaction> transactionList = new ArrayList<>();

  public Account() {
  }

  public Account(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public abstract void withdraw(double amount);

  public abstract void deposit(double amount);

  /**
   * binh.
   *
   * @param amount binh.
   * @throws BankException binh.
   */
  public void doWithdrawing(double amount) throws BankException {
    if (amount > balance) {
      throw new InsufficientFundsException(amount);
    } else if (amount <= 0) {
      throw new InvalidFundingAmountException(amount);
    } else {
      balance -= amount;
    }
  }

  /**
   * binh.
   *
   * @param amount binh.
   * @throws BankException binh.
   */
  public void doDepositing(double amount) throws BankException {
    if (amount <= 0) {
      throw new InvalidFundingAmountException(amount);
    } else {
      balance += amount;
    }
  }

  /**
   * binh.
   *
   * @return bin.
   */
  public String getTransactionHistory() {
    StringBuilder ans = new StringBuilder(
        String.format("Lịch sử giao dịch của tài khoản %s:\n", accountNumber));
    for (Transaction transaction : transactionList) {
      ans.append(transaction.getTransactionSummary()).append("\n");
    }
    return ans.toString();
  }

  /**
   * binh.
   *
   * @param transaction binh.
   */
  public void addTransaction(Transaction transaction) {
    transactionList.add(transaction);
  }

  /**
   * binh.
   *
   * @param o binh.
   * @return binh.
   */
  @Override
  public boolean equals(Object o) {
    if (o instanceof Account) {
      return ((Account) o).accountNumber == accountNumber;
    }
    return false;
  }
}