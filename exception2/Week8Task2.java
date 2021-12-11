package exception2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

  public void nullPointerEx() throws NullPointerException {
    throw new NullPointerException();
  }

  /**
   * throw.
   *
   * @return throw.
   */
  public String nullPointerExTest() {
    try {
      nullPointerEx();
      return "Không có lỗi";
    } catch (NullPointerException e) {
      return "Lỗi Null Pointer";
    }
  }

  public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
    throw new NullPointerException();
  }

  /**
   * throw.
   *
   * @return throw.
   */
  public String arrayIndexOutOfBoundsExTest() {
    try {
      arrayIndexOutOfBoundsEx();
      return "Không có lỗi";
    } catch (NullPointerException e) {
      return "Lỗi Array Index Out of Bounds";
    }
  }

  public void arithmeticEx() throws ArithmeticException {
    throw new NullPointerException();
  }

  /**
   * throw.
   *
   * @return throw.
   */
  public String arithmeticExTest() {
    try {
      arithmeticEx();
      return "Không có lỗi";
    } catch (NullPointerException e) {
      return "Lỗi Arithmetic";
    }
  }

  public void fileNotFoundEx() throws FileNotFoundException {
    throw new FileNotFoundException("Lỗi File Not Found");
  }

  /**
   * throw.
   *
   * @return throw.
   */
  public String fileNotFoundExTest() {
    try {
      fileNotFoundEx();
      return "Không có lỗi";
    } catch (FileNotFoundException n) {
      return "Lỗi File Not Found";
    }
  }

  public void ioEx() throws IOException {
    throw new IOException("Lỗi IO");
  }

  /**
   * throw.
   *
   * @return throw.
   */
  public String ioExTest() {
    try {
      ioEx();
      return "Không có lỗi";
    } catch (IOException e) {
      return "Lỗi IO";
    }
  }
}
