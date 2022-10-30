package hmos9c.application;

import hmos9c.annotation._54Fancy;
import hmos9c.data._41LoginRequest;
import hmos9c.error._46ValidationException;
import hmos9c.util._47ValidationUtil;

public class _48ValidationApp {

  @_54Fancy(name = "AnimalApp", tags = {"application", "java"})
  public static void main(String[] args) {

    _41LoginRequest loginRequest = new _41LoginRequest("Sanas", "rahasia");

    try {
      _47ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (_46ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    } finally {
      System.out.println("Selalu di eksekusi");
    }


    _41LoginRequest loginRequest2 = new _41LoginRequest(null, null);
    _47ValidationUtil.validateRuntime(loginRequest2);
    System.out.println("Sukses");

  }
}
