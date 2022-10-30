package hmos9c.data;

public class _12Product {

  public String name;
  public int price;

  public _12Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String toString() {
    return "Product name:" + name + ", price:" + price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    _12Product product = (_12Product) o;

    if (price != product.price) return false;
    return name != null ? name.equals(product.name) : product.name == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + price;
    return result;
  }

//  public boolean equals(Object o) {
//    if (o == this) {
//      return true;
//    }
//
//    if (!(o instanceof Product)) {
//      return false;
//    }
//
//    Product product = (Product) o;
//
//    if (this.price != product.price) {
//      return false;
//    }
//
//    if (this.name != null) {
//      return this.name.equals(product.name);
//    } else {
//      return product.name == null;
//    }
//  }
}
