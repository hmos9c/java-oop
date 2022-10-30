package hmos9c.data;

public class _32Company {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public class Employee {

    private String name;

    public String getCompany() {
      return _32Company.this.name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
