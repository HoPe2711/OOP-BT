package giuaki;

public class HinhTron extends Hinh {

  protected double bankinh;

  public HinhTron() {
  }

  public HinhTron(double bankinh) {
    this.bankinh = bankinh;
  }

  public double getBankinh() {
    return bankinh;
  }

  public void setBankinh(double bankinh) {
    this.bankinh = bankinh;
  }

  @Override
  public double tinhChuVi() {
    return 2.0 * bankinh * Math.PI;
  }

  @Override
  public void veHinh(){
    System.out.println("giuaki.Hinh tron");
  }
}
