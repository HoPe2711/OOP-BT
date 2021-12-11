package exception1;

public abstract class Expression {

  public abstract String toString();

  public abstract double evaluate();

  public static void main(String[] args) {
    Expression e = new Square(
        new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(3)),
            new Multiplication(new Numeral(4), new Numeral(3))));
    System.out.println(e);
    System.out.println(e.evaluate());
    Expression e1 = new Division(new Numeral(0), new Numeral(0));
    System.out.println(e1.evaluate());
    System.out.println(e1);
  }
}
