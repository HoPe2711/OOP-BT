package giuaki;

public class TamGiac extends Hinh {

  protected double canh1;
  protected double canh2;
  protected double canh3;

  public TamGiac() {
  }

  public TamGiac(double canh1, double canh2, double canh3) {
    this.canh1 = canh1;
    this.canh2 = canh2;
    this.canh3 = canh3;
  }

  @Override
  public double tinhChuVi() {
    return (canh1 + canh2 + canh3);
  }

  @Override
  public void veHinh() {
    System.out.println("Tam giac");
  }

}
