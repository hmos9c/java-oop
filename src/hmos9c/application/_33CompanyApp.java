package hmos9c.application;

import hmos9c.data._32Company;

public class _33CompanyApp {
  public static void main(String[] args) {


    _32Company company = new _32Company();
    company.setName("hmos9c");

    _32Company.Employee employee = company.new Employee();
    employee.setName("Sanas");

    System.out.println(employee.getName());
    System.out.println(employee.getCompany());

    _32Company company2 = new _32Company();
    company2.setName("Belum Ada");

    _32Company.Employee employee2 = company2.new Employee();
    employee2.setName("Akmal");

    System.out.println(employee2.getName());
    System.out.println(employee2.getCompany());

  }
}
