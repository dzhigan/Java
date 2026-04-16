import java.util.*;

class Order {
    int price;

    Order(int price) {
        this.price = price;
    }
}

public class Task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(500),
                new Order(1500),
                new Order(2000)
        );

        orders.stream()
              .filter(o -> o.price > 1000)
              .sorted(Comparator.comparing(o -> o.price))
              .forEach(o -> System.out.println(o.price));
    }
}