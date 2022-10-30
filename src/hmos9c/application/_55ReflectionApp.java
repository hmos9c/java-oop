package hmos9c.application;

import hmos9c.data._56CreateUserRequest;
import hmos9c.util._47ValidationUtil;

public class _55ReflectionApp {
  public static void main(String[] args) {

    _56CreateUserRequest request = new _56CreateUserRequest();
    request.setUsername("sanas");
    request.setPassword("sanas");
    request.setName("sanas");

    _47ValidationUtil.validationReflection(request);

  }
}
