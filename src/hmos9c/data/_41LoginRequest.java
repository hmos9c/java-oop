package hmos9c.data;

  public record _41LoginRequest(String username, String password) {

  public _41LoginRequest {
    System.out.println("Membuat object LoginRequest");
  }

  public _41LoginRequest(String username) {
    this(username, "");
  }

  public _41LoginRequest() {
    this("", "");
  }

}
