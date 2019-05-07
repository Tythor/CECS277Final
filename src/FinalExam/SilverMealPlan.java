package FinalExam;

public class SilverMealPlan extends BronzeMealPlan {
	
	private String salad, breadsticks;
	private final int COST = 90;
	
	/**
	 * Constructor which sets the number of pizzas, number of soda bottles, number of toppings, and salad & breadsticks 
	 * @param np represents the number of pizzas
	 * @param ns represents the number of soda bottles
	 * @param nt represents the number of toppings
	 * @param s represents salad
	 * @param b represents breadsticks
	 */
	public SilverMealPlan(int np, int ns, int nt, String s, String b)
	{
		super(np, ns, nt, s);
		
		salad = s;
		breadsticks = b;
	}
	
	/**
	 * method that sets the salad
	 * @param s represents the salad
	 */
	public void setSalad(String s)
	{
		salad = s;
	}
	
	/**
	 * method that sets the breadsticks
	 * @param b represents the breadsticks
	 */
	public void setBreadsticks(String b)
	{
		breadsticks = b;
	}
	
	/**
	 * method that returns the salad
	 * @return a String representing the salad
	 */
	public String getSalad()
	{
		return salad;
	}
	
	/**
	 * method that returns the breadsticks
	 * @return a String representing the breadsticks
	 */
	public String getBreadsticks()
	{
		return breadsticks;
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
	 * method that returns a String representation of the contents of the silver meal plan
	 */
	public String toString()
	{
		return super.toString() + ", " + breadsticks;
	}
	
	/**
	 * main tester for the silver meal plan class
	 * @param args
	 */
	public static void main(String[] args) {
		SilverMealPlan smp = new SilverMealPlan(3, 5, 3, "Salad", "Breadsticks");
		System.out.println(smp.toString());
		System.out.println("Cost: $" + smp.getCost());
	}
}
