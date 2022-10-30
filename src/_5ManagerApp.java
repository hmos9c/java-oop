public class _5ManagerApp {
  public static void main(String[] args) {


    var manager = new Manager("Sanas");
    manager.sayHello("Akmal");

    var vp = new VicePresident("Ardi");
    vp.sayHello("Akmal");

    System.out.println(manager);
    System.out.println(manager.toString());
    System.out.println(vp);
    System.out.println(vp.toString());
  }
}
