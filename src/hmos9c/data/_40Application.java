package hmos9c.data;

public class _40Application {

  public static final int PROCESSORS;

  static {
    System.out.println("Mengakses class Application");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }

}
