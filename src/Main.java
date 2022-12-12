import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product bananas = new Product("Бананы", 56.00, 2.0);
        Product apples = new Product("Яблоки", 129.00, 4.0);
        Product plums = new Product("Сливы", 160.00, 1.0);
        Product oranges = new Product("Апельсины", 78.00, 2.5);
        Product sugar = new Product("Сахар", 65.00, 2.0);
//        Product flour = new Product("", 94.00, 3.0);

        System.out.println(bananas);
        System.out.println(apples);
//        System.out.println(flour);

        List<Product> products = List.of(
                bananas, apples, plums, oranges, sugar
        );
        bananas.addProduct(apples);
//        bananas.addProduct(bananas);

        Recipe pie = new Recipe("Шарлотка", products, 263.00);
        Recipe cake = new Recipe("Медовик", products, 500.00);
        Recipe cake1 = new Recipe("Наполеон", products, 659.00);
        System.out.println(pie);
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(pie);
        recipes.add(cake);
        recipes.add(cake1);
        recipes.add(pie);
        System.out.println(Arrays.toString(recipes.toArray()));
    }
}