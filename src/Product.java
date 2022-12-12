import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private double totalKg;
    private List<Product> products = new ArrayList<>();

    Product(String name, double price, double totalKg) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (totalKg > 0) {
            this.totalKg = totalKg;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public void addProduct(Product name) {
        if (equals(name)) {
            throw new RuntimeException("Этот продукт уже есть в списке");
        } else {
            products.add(name);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(double totalKg) {
        this.totalKg = totalKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "В список добавлены продукты:  " + getName() + ", " + price + " руб., " + totalKg + " кг.";
    }
}
