package FinalExam;

public class Main {
    public static void main(String[] args) {
    	
    	BasicMealPlan bmp = new BasicMealPlan(3, 2, 1);
    	
    	System.out.println(bmp.toString());
    	
    	bmp.addTopping("Cheese");
    	bmp.addTopping("Pepperoni");
    	bmp.addTopping("Ham");
    	
    	bmp.displayToppings();
    	
    }
}
