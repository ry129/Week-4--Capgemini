package PersonalizedMealPlanGenerator;

public class MealGenerator {
    // Generic method to generate a meal plan
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("\nGenerating Meal Plan:");
        meal.showMeal();
        System.out.println("Meal plan successfully created!\n");
    }
}
