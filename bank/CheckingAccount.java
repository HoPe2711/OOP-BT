package bank;

public class CheckingAccount extends Account {

  /**
   * binh.
   *
   * @param accountNumber binh.
   * @param balance       binh.
   */
  public CheckingAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  /**
   * binh.
   *
   * @param amount binh.
   */
  @Override
  public void deposit(double amount) {
    try {
      double pref = getBalance();
      doDepositing(amount);
      addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
          amount, pref, getBalance()));

    } catch (BankException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * binh.
   *
   * @param amount binh.
   */
  @Override
  public void withdraw(double amount) {
    try {
      double pref = getBalance();
      doWithdrawing(amount);
      addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
          amount, pref, getBalance()));
    } catch (BankException e) {
      System.out.println(e.getMessage());
    }
  }
}