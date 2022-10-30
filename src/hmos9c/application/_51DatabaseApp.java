package hmos9c.application;

import hmos9c.error._50DatabaseError;

public class _51DatabaseApp {
  public static void main(String[] args) {
    connectDatabase("sanas", null);
    System.out.println("Sukses");
  }

  public static void connectDatabase(String username, String password) {
    if (username == null || password == null) {
      throw new _50DatabaseError("Tidak bisa konek ke database");
    }
  }
}
