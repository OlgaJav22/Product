import java.util.List;
import java.util.Objects;

public class Recipe {
    private String name;
    private double totalSumPrice;
    private List<Product> products;

    Recipe(String name, List<Product> products, double totalSumPrice) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
        if (totalSumPrice > 0) {
            this.totalSumPrice = totalSumPrice;
        }
        this.products = products;

    }

    public String getName() {
        return name;
    }

    public double getTotalSumPrice() {
        return totalSumPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Название рецепта: " + getName();
    }
}
