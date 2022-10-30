package hmos9c.application;

import hmos9c.data._43Level;
import hmos9c.data._44Customer;

public class _45EnumApp {
    public static void main(String[] args) {

        _44Customer customer = new _44Customer();
        customer.setName("Sanas");
        customer.setLevel(_43Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = _43Level.VIP.name();
        System.out.println(levelName);

        _43Level level = _43Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for (var value : _43Level.values()) {
            System.out.println(value);
        }


    }
}
