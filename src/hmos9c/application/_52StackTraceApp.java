package hmos9c.application;

public class _52StackTraceApp {
  public static void main(String[] args) {

    try {
      sampleError();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }

  }

  public static void sampleError() {
    try {
      String[] names = {
          "Sanas", "Febriyan"
      };

      System.out.println(names[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
