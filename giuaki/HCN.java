package giuaki;

public class HCN extends Hinh {

  protected double chieuDai;
  protected double chieuRong;

  public HCN() {
  }

  public HCN(double chieuDai, double chieuRong) {
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
  }

  public double getChieuDai() {
    return chieuDai;
  }

  public void setChieuDai(double chieuDai) {
    this.chieuDai = chieuDai;
  }

  public double getChieuRong() {
    return chieuRong;
  }

  public void setChieuRong(double chieuRong) {
    this.chieuRong = chieuRong;
  }

  @Override
  public double tinhChuVi() {
    return (chieuDai + chieuRong) * 2;
  }

  @Override
  public void veHinh(){
    System.out.println("giuaki.Hinh chu nhat");
  }

}
