package hmos9c.data;

public class _29Bus implements _24Car{
  public void drive() {
    System.out.println("Bus drive");
  }

  public int getTier() {
    return 8;
  }

  public String getBrand() {
    return "HINO";
  }

  public boolean isMaintenance() {
    return false;
  }

  public boolean isBig() {
    return true;
  }
}
