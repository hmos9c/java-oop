package hmos9c.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class _53ReadApp {
  public static void main(String[] args) {

    try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }

    } catch (Throwable throwable) {
      System.out.println("Error membaca file " + throwable.getMessage());
    }

  }
}
