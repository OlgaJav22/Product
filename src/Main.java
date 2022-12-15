import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product bananas = new Product("Бананы", 56.00, 2.0);
        Product apples = new Product("Яблоки", 129.00, 4.0);
        Product plums = new Product("Сливы", 160.00, 1.0);
        Product oranges = new Product("Апельсины", 78.00, 2.5);
        Product sugar = new Product("Сахар", 65.00, 2.0);
        Product flour = new Product("Мука", 94.00, 3.0);
        Product honey = new Product("Мёд", 185.00, 1);

        System.out.println(bananas);
        System.out.println(apples);
//        System.out.println(flour);

        List<Product> products = List.of(
                bananas, apples, plums, oranges, sugar
        );
        bananas.addProduct(apples);
//        bananas.addProduct(bananas);

//        HashMap<Product, Integer> products1 = new HashMap<>();
//        products1.put(bananas, 2);
//        products1.put(apples, 4);
//        products1.put(plums, 1);
//        products1.put(sugar, 1);

        Recipe pie = new Recipe("Шарлотка", sugar, apples, flour);
        Recipe cake = new Recipe("Медовик", sugar, flour,honey);
        Recipe cake1 = new Recipe("Наполеон", sugar, flour, oranges);
        pie.setTotalSumPrice(sugar.getPrice()+ apples.getPrice()+ flour.getPrice());
        cake.setTotalSumPrice(sugar.getPrice()+ flour.getPrice()+ honey.getPrice());


        Set<Recipe> recipes = new HashSet<>();
        recipes.add(pie);
        recipes.add(cake);
        recipes.add(cake1);
        System.out.println(Arrays.toString(recipes.toArray()));

        System.out.println("\n Д/з №2.2");
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add((int) (1001 * Math.random()));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
        System.out.println("Задание 3.2");

        Set<Examples> examples = new HashSet<>();
        while (examples.size() < 15) {
            Examples example = new Examples(random.nextInt(8) + 2, random.nextInt(8) + 2);
            examples.add(example);

            System.out.println(example);
        }
    }

}