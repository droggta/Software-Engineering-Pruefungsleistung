public class Product {
    private final int id;
    private final String name;
    private final int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ Product : ").append("id = ").append(id).append(", ");
        stringBuilder.append("name = ").append(name).append(", ");
        stringBuilder.append("price = ").append(price).append(" }");
        return stringBuilder.toString();
    }
}