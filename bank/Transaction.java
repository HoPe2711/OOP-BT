package bank;

public class Transaction {

  public static final int TYPE_DEPOSIT_CHECKING = 0;
  public static final int TYPE_WITHDRAW_CHECKING = 1;
  public static final int TYPE_DEPOSIT_SAVINGS = 2;
  public static final int TYPE_WITHDRAW_SAVINGS = 3;
  private final int type;
  private final double amount;
  private final double initialBalance;
  private final double finalBalance;

  /**
   * binh.
   *
   * @param type           binh.
   * @param amount         binh.
   * @param initialBalance binh.
   * @param finalBalance   binh.
   */
  public Transaction(int type, double amount, double initialBalance, double finalBalance) {
    this.type = type;
    this.amount = amount;
    this.initialBalance = initialBalance;
    this.finalBalance = finalBalance;
  }

  /**
   * binh.
   *
   * @param type binh.
   * @return binh.
   */
  private String getTransactionTypeString(int type) {
    if (type == TYPE_DEPOSIT_CHECKING) {
      return "Nạp tiền vãng lai";
    } else if (type == TYPE_WITHDRAW_CHECKING) {
      return "Rút tiền vãng lai";
    } else if (type == TYPE_DEPOSIT_SAVINGS) {
      return "Nạp tiền tiết kiệm";
    } else if (type == TYPE_WITHDRAW_SAVINGS) {
      return "Rút tiền tiết kiệm";
    }
    return "";
  }

  /**
   * binh.
   *
   * @return binh.
   */
  public String getTransactionSummary() {
    return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. "
            + "Số tiền: $%.2f. Số dư cuối: $%.2f.", getTransactionTypeString(type),
        initialBalance, amount, finalBalance);
  }
}