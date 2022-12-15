import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Recipe {
    private String name;
    private double totalSumPrice;
    private HashMap <Product, Integer> products1;

    Recipe(String name,  Product ... products) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
            this.products1 = new HashMap<>();
        }
        setTotalSumPrice(0.0);
        for (Product product : products) {
            setTotalSumPrice(getTotalSumPrice()+product.getPrice());
            this.products1.put(product, product.getCount());
        }
    }

    public String getName() {
        return name;
    }

    public double getTotalSumPrice() {
        return totalSumPrice;
    }

    public void setTotalSumPrice(double totalSumPrice) {
        this.totalSumPrice = totalSumPrice;
    }

    public HashMap<Product, Integer> getProducts() {
        return products1;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products1 = products;
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
        return "Название рецепта: " + getName() + ", сумма затрат " + totalSumPrice + ", список продуктов:  " + products1;
    }
}
