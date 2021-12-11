package bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bank {

  private final List<Customer> customerList = new ArrayList<>();

  /**
   * binh.
   *
   * @param inputStream binh.
   */
  public void readCustomerList(InputStream inputStream) {
    Scanner scanner = new Scanner(inputStream);
    Customer customer = null;
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] customerInfo = line.split(" ");
      if (isInteger(customerInfo[customerInfo.length - 1])) {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < customerInfo.length - 1; i++) {
          name.append(customerInfo[i]).append(" ");
        }
        customer = new Customer(Long.parseLong(customerInfo[customerInfo.length - 1]),
            name.toString().trim());
        customerList.add(customer);
      } else {
        if (customerInfo[1].equals(Account.CHECKING)) {
          Objects.requireNonNull(customer)
              .addAccount(new CheckingAccount(Long.parseLong(customerInfo[0]),
                  Double.parseDouble(customerInfo[2])));
        } else if (customerInfo[1].equals(Account.SAVINGS)) {
          Objects.requireNonNull(customer)
              .addAccount(new SavingsAccount(Long.parseLong(customerInfo[0]),
                  Double.parseDouble(customerInfo[2])));
        }
      }
    }
  }

  /**
   * binh.
   *
   * @return binh.
   */
  public String getCustomersInfoByIdOrder() {
    List<Customer> customerList = new ArrayList<>(this.customerList);
    customerList.sort(Comparator.comparing(Customer::getIdNumber));
    StringBuilder ans = new StringBuilder();
    for (Customer customer : customerList) {
      ans.append(customer.getCustomerInfo()).append("\n");
    }
    return ans.toString().trim();
  }

  /**
   * binh.
   *
   * @return binh.
   */
  public String getCustomersInfoByNameOrder() {
    List<Customer> customerList = new ArrayList<>(this.customerList);
    customerList.sort(Comparator.comparing(Customer::getFullName));
    StringBuilder ans = new StringBuilder();
    for (Customer customer : customerList) {
      ans.append(customer.getCustomerInfo()).append("\n");
    }
    return ans.toString().trim();
  }

  /**
   * binh.
   *
   * @return binh.
   */
  public List<Customer> getCustomerList() {
    return customerList;
  }

  /**
   * binh.
   *
   * @param s binh.
   * @return binh.
   */
  private static boolean isInteger(String s) {
    try {
      Long.parseLong(s);
    } catch (NumberFormatException | NullPointerException e) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) throws FileNotFoundException {
    Bank bank = new Bank();
    File file = new File("src/main/java/bank/input.txt");
    InputStream inputStream = new FileInputStream(file);
    bank.readCustomerList(inputStream);
    System.out.println(bank.getCustomersInfoByIdOrder());

    Customer cus1 = bank.getCustomerList().get(0);
    System.out.println(cus1.getAccountList());

    Account acc1 = cus1.getAccountList().get(0);
    acc1.deposit(100);
    acc1.deposit(-1);
    acc1.withdraw(50);

    System.out.println(acc1.getTransactionHistory());

    Account acc2 = cus1.getAccountList().get(1);
    acc2.deposit(100);
    acc2.withdraw(1200);
    System.out.println(acc2.getTransactionHistory());

  }
}
