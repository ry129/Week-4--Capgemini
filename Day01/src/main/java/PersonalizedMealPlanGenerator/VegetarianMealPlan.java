package PersonalizedMealPlanGenerator;

public class VegetarianMealPlan implements MealPlan{
    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal : Includes Fruits , vegetables , dairy and grains");
    }
}
