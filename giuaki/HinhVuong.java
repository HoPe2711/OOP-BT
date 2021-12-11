package giuaki;

public class HinhVuong extends HCN {

  public HinhVuong() {
  }

  public HinhVuong(double side) {
    super.setChieuDai(side);
    super.setChieuRong(side);
  }

  @Override
  public double tinhChuVi() {
    return super.getChieuDai() * 4;
  }

  @Override
  public void veHinh(){
    System.out.println("giuaki.Hinh vuong");
  }
}
