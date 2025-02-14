package PersonalizedMealPlanGenerator;

public class VeganMealPlan implements MealPlan{
    @Override
    public void showMeal() {
        System.out.println("Vegan Meal : Includes plant-based foods , nuts , legumes");
    }
}
