public class _9PolymorphismApp {
  public static void main(String[] args) {


    Employee employee = new Employee("Sanas");
    employee.sayHello("Akmal");

    employee = new Manager("Sanas");
    employee.sayHello("Akmal");

    employee = new VicePresident("Sanas");
    employee.sayHello("Akmal");

    sayHello(new Employee("Sanas"));
    sayHello(new Manager("Ardi"));
    sayHello(new VicePresident("Akmal"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else {
      System.out.println("Hello " + employee.name);
    }
  }
}
