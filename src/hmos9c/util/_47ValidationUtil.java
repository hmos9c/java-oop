package hmos9c.util;

import hmos9c.annotation._57NotBlank;
import hmos9c.data._41LoginRequest;
import hmos9c.error._49BlankException;
import hmos9c.error._46ValidationException;

import java.lang.reflect.Field;

public class _47ValidationUtil {

  public static void validate(_41LoginRequest loginRequest) throws _46ValidationException, NullPointerException {
    if (loginRequest.username() == null) {
      throw new NullPointerException("Username is null");
    } else if (loginRequest.username().isBlank()) {
      throw new _46ValidationException("Username is blank");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("Password is null");
    } else if (loginRequest.password().isBlank()) {
      throw new _46ValidationException("Password is blank");
    }
  }

  public static void validateRuntime(_41LoginRequest loginRequest) {
    if (loginRequest.username() == null) {
      throw new NullPointerException("Username is null");
    } else if (loginRequest.username().isBlank()) {
      throw new _49BlankException("Username is blank");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("Password is null");
    } else if (loginRequest.password().isBlank()) {
      throw new _49BlankException("Password is blank");
    }
  }

  public static void validationReflection(Object object) {
    Class aClass = object.getClass();
    Field[] fields = aClass.getDeclaredFields();

    for (var field : fields) {
      field.setAccessible(true);

      if (field.getAnnotation(_57NotBlank.class) != null) {
        // validated
        try {
          String value = (String) field.get(object);

          if (value == null || value.isBlank()) {
            throw new _49BlankException("Field " + field.getName() + " is blank ");
          }

        } catch (IllegalAccessException exception) {
          System.out.println("Tidak bisa mengakses field " + field.getName());
        }
      }

    }
  }

}
