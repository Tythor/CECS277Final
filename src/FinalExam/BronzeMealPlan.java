package FinalExam;

public class BronzeMealPlan extends BasicMealPlan {
	
	private String side;
	private final int COST = 75;
	
	/**
	 * default constructor
	 * **/
	public BronzeMealPlan() {
		numPizzas = 3;
		numSoda = 5;
		numToppings = 2;
		side = "Side option of salad or breadsticks";
	}
	/**
	 * Constructor which sets the number of pizzas, number of soda bottles, number of toppings, and type of side
	 * @param np represents the number of pizzas
	 * @param ns represents the number of soda bottles
	 * @param nt represents the number of toppings
	 * @param s represents the type of side 
	 */
	public BronzeMealPlan(int np, int ns, int nt, String s)
	{
		super(np, ns, nt);
		
		side = s;
	}
	
	/**
	 * method that sets the type of side 
	 * @param s represents the type of side 
	 */
	public void setSide(String s)
	{
		side = s;
	}
	
	/**
	 * method that returns the type of side
	 * @return a String representing the type of side 
	 */
	public String getSide()
	{
		return side;
	}
	
	/**
	 * method that returns the cost of the meal plan
	 * @return an integer representing the cost of the meal plan
	 */
	public int getCost()
	{
		return COST;
	}
	
	/**
	 * method that returns a String representation of the contents of the bronze meal plan
	 */
	public String toString()
	{
		
		return super.toString() + "\n" + side;
	}
	
	/**
	 * main tester for the bronze meal plan class
	 * @param args
	 */
	public static void main(String[] args) {
		BronzeMealPlan bmp = new BronzeMealPlan(3, 5, 2, "Salad");
		System.out.println(bmp.toString());
		System.out.println("Cost: $" + bmp.getCost());
	}
	
}
