package hmos9c.application;

import hmos9c.data._41LoginRequest;

public class _42RecordApp {
  public static void main(String[] args) {

    _41LoginRequest loginRequest = new _41LoginRequest("sanas", "rahasia");

    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);

    System.out.println(new _41LoginRequest());
    System.out.println(new _41LoginRequest("sanas"));
    System.out.println(new _41LoginRequest("sanas", "rahasia"));

  }
}
