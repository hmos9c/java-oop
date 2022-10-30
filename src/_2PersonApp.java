public class _2PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Sanas", "Jakarta");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Akmal");

    Person person2 = new Person("Akmal");

    Person person3;
    person3 = new Person();
    person3.name = "Ardi";
    person3.sayHello("Akmal");

  }
}
