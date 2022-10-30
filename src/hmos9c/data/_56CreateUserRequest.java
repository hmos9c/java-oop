package hmos9c.data;

import hmos9c.annotation._57NotBlank;

public class _56CreateUserRequest {

  @_57NotBlank
  private String username;

  @_57NotBlank
  private String password;

  @_57NotBlank
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
