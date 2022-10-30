package hmos9c.data;

public class _13ProductApp {
  public static void main(String[] args) {

    _12Product product = new _12Product("Mac Book Pro", 30000000);

    System.out.println(product.name);
    System.out.println(product.price);

    System.out.println(product);

    _12Product product2 = new _12Product("Mac Book Pro", 30000000);

    System.out.println(product.equals(product2));
    System.out.println(product.hashCode() == product2.hashCode());

  }
}
