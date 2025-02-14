package PersonalizedMealPlanGenerator;

public class personalizedMealPlanGenerator {
    public static void main(String[] args) {
        // Creating meal objects
        VegetarianMealPlan vegMeal = new VegetarianMealPlan();
        VeganMealPlan veganMeal = new VeganMealPlan();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal proteinMeal = new HighProteinMeal();

        // Using generic class Meal<T>
        Meal<VegetarianMealPlan> meal1 = new Meal<>(vegMeal);
        Meal<VeganMealPlan> meal2 = new Meal<>(veganMeal);
        Meal<KetoMeal> meal3 = new Meal<>(ketoMeal);
        Meal<HighProteinMeal> meal4 = new Meal<>(proteinMeal);

        // Display meal details
        meal1.showMeal();
        meal2.showMeal();
        meal3.showMeal();
        meal4.showMeal();

        // Using generic method to generate a meal plan
        MealGenerator.generateMealPlan(vegMeal);
        MealGenerator.generateMealPlan(veganMeal);
        MealGenerator.generateMealPlan(ketoMeal);
        MealGenerator.generateMealPlan(proteinMeal);
    }
}
