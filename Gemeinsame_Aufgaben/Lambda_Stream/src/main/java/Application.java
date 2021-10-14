import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Application implements IApplication {
    private final List<Order> orderList;

    public Application() {
        orderList = new ArrayList<>();
    }

    public static void main(String... args) {
        Application application = new Application();
        application.loadRecords();

        application.executeQuery01();
        application.executeQuery02();
        application.executeQuery03();
        application.executeQuery04();
        application.executeQuery05();
        application.executeQuery06();
        application.executeQuery07();
        application.executeQuery08();
        application.executeQuery09();
        application.executeQuery10();
        application.executeQuery11();
        application.executeQuery12();
        application.executeQuery13();
        application.executeQuery14();
    }

    public void loadRecords() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Configuration.instance.dataPath + "records.csv"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] entries = line.split(";");
                int id = Integer.parseInt(entries[0]);
                Town town = new Town(Integer.parseInt(entries[2]), entries[3]);
                Customer customer = new Customer(Integer.parseInt(entries[1]), town);
                Product product = new Product(Integer.parseInt(entries[4]), entries[5], Integer.parseInt(entries[6]));
                int quantity = Integer.parseInt(entries[7]);
                int deliveryTimeInHours = Integer.parseInt(entries[8]);
                orderList.add(new Order(id, customer, product, quantity, deliveryTimeInHours));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void executeQuery01() {
        System.out.println("--- executeQuery01 ---");
        System.out.println(orderList.size());
        System.out.println();
    }

    public void executeQuery02() {
        System.out.println("--- executeQuery02 ---");

        long solution = orderList.stream()
                .filter(x -> x.getCustomer().getTown().getRegion().equals("A"))
                .filter(x -> x.getProduct().getId() >= 100)
                .filter(x -> x.getProduct().getId() <= 500)
                .filter(x -> x.getQuantity() > 1)
                .count();

        System.out.println("2: " + solution);
    }

    public void executeQuery03() {
        System.out.println("--- executeQuery03 ---");

        long solution = orderList.stream()
                .filter(x -> x.getCustomer().getTown().getId() >= 5)
                .filter(x -> x.getCustomer().getTown().getId() <= 75)
                .filter(x -> "BCG".contains(x.getCustomer().getTown().getRegion()))
                .filter(x -> x.getProduct().getId() >= 50)
                .filter(x -> x.getProduct().getId() <= 500)
                .filter(x -> x.getQuantity() <= 2)
                .count();

        System.out.println(solution);
    }

    public void executeQuery04() {
        System.out.println("--- executeQuery04 ---");
        System.out.println();
    }

    public void executeQuery05() {
        System.out.println("--- executeQuery05 ---");
        System.out.println();
    }

    public void executeQuery06() {
        System.out.println("--- executeQuery06 ---");

        long solution = ((long) orderList.stream()
                .filter(x -> x.getCustomer().getTown().getId() <= 100)
                .filter(x -> !"BDG".contains(x.getCustomer().getTown().getRegion()))
                .filter(x -> x.getProduct().getId() >= 125)
                .filter(x -> x.getProduct().getId() <= 425)
                .mapToLong(Order::getQuantity)
                .summaryStatistics().getAverage());

        System.out.println(solution);
    }

    public void executeQuery07() {
        System.out.println("--- executeQuery07 ---");
        System.out.println();
    }

    public void executeQuery08() {
        System.out.println("--- executeQuery08 ---");

        Comparator<Order> desc = (Order id1, Order id2) -> (int) (id2.getId() - id1.getId());
        Comparator<Order> asc = (Order id3, Order id4) -> (int) (id3.getId() - id4.getId());

        List<Integer> solution = orderList.stream()
                .filter(x -> x.getCustomer().getTown().getId() >= 5)
                .filter(x -> x.getCustomer().getTown().getId() <= 7)
                .filter(x -> "AB".contains(x.getCustomer().getTown().getRegion()))
                .filter(x -> x.getProduct().getId() >= 250)
                .filter(x -> x.getProduct().getId() <= 252)
                .filter(x -> x.getQuantity() == 1)
                .map(Order::getId)
                .collect(Collectors.toList());
        Collections.sort(orderList, desc);

        System.out.println(solution);
    }

    public void executeQuery09() {
        System.out.println("--- executeQuery09 ---");
        System.out.println();
    }

    public void executeQuery10() {
        System.out.println("--- executeQuery10 ---");

        Map<Object, Long> solution = orderList.stream()
                .filter(x -> x.getCustomer().getTown().getRegion().equals("C"))
                .filter(x -> x.getProduct().getId() <= 10)
                .filter(x -> x.getQuantity() <= 2)
                .collect(Collectors.groupingBy(x -> x.getProduct().getId(), Collectors.counting()));

        System.out.println(solution);
    }

    public void executeQuery11() {
        System.out.println("--- executeQuery11 ---");

        Map<Object, Long> solution = orderList.stream()
                .filter(x -> "ABC".contains(x.getCustomer().getTown().getRegion()))
                .filter(x -> x.getProduct().getId() >= 125)
                .filter(x -> x.getProduct().getId() <= 425)
                .filter(x -> x.getQuantity() > 1)
                .collect(Collectors.groupingBy(x -> x.getCustomer().getTown().getRegion(), Collectors.counting()));

        System.out.println(solution);
    }

    public void executeQuery12() {
        System.out.println("--- executeQuery12 ---");
        System.out.println();
    }

    public void executeQuery13() {
        System.out.println("--- executeQuery13 ---");
        System.out.println();
    }

    public void executeQuery14() {
        System.out.println("--- executeQuery14 ---");

        Map<Object, Double> solution = orderList.stream()
                .filter(x -> "CDE".contains(x.getCustomer().getTown().getRegion()))
                .filter(x -> x.getCustomer().getTown().getId() >= 50)
                .filter(x -> x.getCustomer().getTown().getId() <= 100)
                .filter(x -> x.getProduct().getId() == 10 || x.getProduct().getId() == 20 || x.getProduct().getId() == 30 || x.getProduct().getId() == 40 || x.getProduct().getId() == 50)
                .collect(Collectors.groupingBy(x -> x.getProduct().getId(), Collectors.averagingInt(Order::getDeliveryTimeInHours)));

        System.out.println(solution);
    }
}