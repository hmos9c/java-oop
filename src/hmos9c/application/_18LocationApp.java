package hmos9c.application;

import hmos9c.data._17City;
import hmos9c.data._16Location;

public class _18LocationApp {
  public static void main(String[] args) {

    // var location = new Location(); // ERROR
    var city = new _17City();
    city.name = "Jakarta";

    System.out.println(city.name);

  }
}
