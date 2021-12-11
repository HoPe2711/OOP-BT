package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  private long idNumber;
  private String fullName;
  private final List<Account> accountList = new ArrayList<>();

  public Customer() {
  }

  /**
   * binh.
   *
   * @param idNumber binh.
   * @param fullName binh.
   */
  public Customer(long idNumber, String fullName) {
    this.idNumber = idNumber;
    this.fullName = fullName;
  }

  /**
   * binh.
   *
   * @return binh.
   */
  public String getCustomerInfo() {
    return String.format("Số CMND: %s. Họ tên: %s.", idNumber, fullName);
  }

  public void addAccount(Account account) {
    accountList.add(account);
  }

  public void removeAccount(Account account) {
    accountList.remove(account);
  }

  public long getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(long idNumber) {
    this.idNumber = idNumber;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public List<Account> getAccountList() {
    return accountList;
  }
}