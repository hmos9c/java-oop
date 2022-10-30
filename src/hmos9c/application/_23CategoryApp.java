package hmos9c.application;

import hmos9c.data._22Category;

public class _23CategoryApp {
  public static void main(String[] args) {


    var category = new _22Category();
    category.setId("ID");
    category.setId(null);

    System.out.println(category.getId());

  }
}
