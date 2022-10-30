package hmos9c.data;

import hmos9c.annotation._54Fancy;

@_54Fancy(name = "Car", tags = {"application", "java"})
public interface _24Car extends _27HasBrand, _28IsMaintenance {

  void drive();

  int getTier();

  default boolean isBig() {
    return false;
  }

}
