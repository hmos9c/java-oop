package hmos9c.application;

import hmos9c.annotation._54Fancy;
import hmos9c.data._19Animal;
import hmos9c.data._20Cat;

@_54Fancy(name = "AnimalApp", tags = {"application", "java"})
public class _21AnimalApp {
  public static void main(String[] args) {


    _19Animal animal = new _20Cat();
    animal.name = "Puss";
    animal.run();

  }
}
