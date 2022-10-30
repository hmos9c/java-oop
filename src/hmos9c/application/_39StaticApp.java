package hmos9c.application;

import static hmos9c.data._40Application.PROCESSORS;
import static hmos9c.data._36Constant.*;
import hmos9c.data._38Country;
import hmos9c.util._37MathUtil;

public class _39StaticApp {
  public static void main(String[] args) {

    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(
        _37MathUtil.sum(1,1,1,1,1)
    );

    _38Country.City city = new _38Country.City();
    city.setName("Jakarta");

    System.out.println(city.getName());

    System.out.println(PROCESSORS);
  }
}
