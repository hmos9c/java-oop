package hmos9c.data;

public class _25Avanza implements _24Car{

  public void drive() {
    System.out.println("Avanza drive");
  }

  public int getTier() {
    return 4;
  }

  public String getBrand() {
    return "Toyota";
  }

  public boolean isMaintenance() {
    return false;
  }
}
