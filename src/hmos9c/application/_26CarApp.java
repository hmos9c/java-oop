package hmos9c.application;

import hmos9c.data._25Avanza;
import hmos9c.data._24Car;

public class _26CarApp {
  public static void main(String[] args) {

    _24Car car = new _25Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
