package hmos9c.application;

import hmos9c.data._34HelloWorld;

public class _35HelloWorldApp {
  public static void main(String[] args) {


    _34HelloWorld english = new _34HelloWorld(){

      public void sayHello() {
        System.out.println("Hello");
      }

      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    _34HelloWorld indonesia = new _34HelloWorld(){

      public void sayHello() {
        System.out.println("Halo");
      }

      public void sayHello(String name) {
        System.out.println("Halo " + name);
      }
    };

    english.sayHello();
    english.sayHello("Sanas");

    indonesia.sayHello();
    indonesia.sayHello("Sanas");

  }
}
