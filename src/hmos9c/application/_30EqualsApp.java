package hmos9c.application;

public class _30EqualsApp {
  public static void main(String[] args) {


    String first = "Sanas";
    first = first + " " + "Febriyan";

    System.out.println(first);

    String second = "Sanas Febriyan";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Sanas Febriyan";

    System.out.println(second == third);
    System.out.println(second.equals(third));

  }
}
