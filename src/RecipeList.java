import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes = new HashSet<>();

    public RecipeList (Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add (Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new RuntimeException("Такой рецепт уже есть!");
        }
        recipes.add(recipe);
    }

    public void remove (Recipe recipe) {
        recipes.remove(recipe);
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "Новый рецепт " + getRecipes();

    }
}
