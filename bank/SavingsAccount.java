package bank;

public class SavingsAccount extends Account {

  /**
   * binh.
   *
   * @param accountNumber binh.
   * @param balance       binh.
   */
  public SavingsAccount(long accountNumber, double balance) {
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
      addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
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
      if (pref >= 5000 && amount <= 1000) {
        doWithdrawing(amount);
        addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
            amount, pref, getBalance()));
      }
    } catch (BankException e) {
      System.out.println(e.getMessage());
    }
  }
}