public class Order {
    private final int id;
    private final Customer customer;
    private final Product product;
    private final int quantity;
    private final int deliveryTimeInHours;

    public Order(int id, Customer customer, Product product, int quantity, int deliveryTimeInHours) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.deliveryTimeInHours = deliveryTimeInHours;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDeliveryTimeInHours() {
        return deliveryTimeInHours;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id).append(";").append(customer.getId()).append(";");
        stringBuilder.append(customer.getTown().getId()).append(";").append(customer.getTown().getRegion()).append(";");
        stringBuilder.append(product.getId()).append(";").append(product.getName()).append(";").append(product.getPrice()).append(";");
        stringBuilder.append(quantity).append(";").append(deliveryTimeInHours);
        return stringBuilder.toString();
    }
}