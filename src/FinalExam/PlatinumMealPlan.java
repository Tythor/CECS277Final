package FinalExam;

public class PlatinumMealPlan extends GoldMealPlan{
	
	private String icFlavor1, icFlavor2;
	private final int COST = 150;
	
	/**
	 * default constructor
	 * **/
	public PlatinumMealPlan() {
		numPizzas = 4;
		numSoda = 5;
		numToppings = 4;
		salad = "Salad";
		breadsticks = "Breadsticks";
		wingFlavor1 = "Choice of chicken wing flavor #1";
		wingFlavor2 = "choice of chicken wing flavor #2";
		wingType = "boneless or bone-in";
		icFlavor1 = "Ice Cream flavor #1";
		icFlavor2 = "ice cream flavor #2";		
		
	}
	
	/**
	* Constructor which sets the number of pizzas, number of soda bottles, number of toppings, two flavors of wings, type of wings, and
	* flavors of ice cream
	 * @param np represents the number of pizzas
	 * @param ns represents the number of soda bottles
	 * @param nt represents the number of toppings
	 * @param wf1 represents the first flavor of wings
	 * @param wf2 represents the second flavor of wings
	 * @param wt represents the type of wings 
	 * @param icf1 represents the first flavor of wings
	 * @param icf2 represents the second flavor of wings
	 */
	public PlatinumMealPlan(int np, int ns, int nt, String wf1, String wf2, String wt, String icf1, String icf2)
	{
		super(np, ns, nt, wf1, wf2, wt);
		
		icFlavor1 = icf1;
		icFlavor2 = icf2;
	}

	/**
	 * method that sets the first flavor of ice cream
	 * @param icf1 represents the first flavor of ice cream
	 */
	public void setICFlavor1(String icf1)
	{
		icFlavor1 = icf1;
	}
	
	/**
	 * method that sets the second flavor of ice cream
	 * @param icf2 represents the second flavor of ice cream
	 */
	public void setICFlavor2(String icf2)
	{
		icFlavor2 = icf2;
	}
	
	/**
	 * method that returns the first flavor of ice cream
	 * @return a String reprsenting the first flavor of ice cream
	 */
	public String getICFlavor1()
	{
		return icFlavor1;
	}
	
	/**
	 * method that returns the second flavor of ice cream
	 * @return a String representing the second flavor of ice cream
	 */
	public String getICFLavor2()
	{
		return icFlavor2;
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
	 * method that returns a String representation of the contents of the platinum meal plan
	 */
	public String toString()
	{
		return super.toString() + "\n" + icFlavor1 + " and " + icFlavor2 + " flavored ice cream";
	}
	
	/**
	 * main tester for the platinum meal plan class
	 * @param args
	 */
	public static void main(String[] args) {
		PlatinumMealPlan pmp = new PlatinumMealPlan(4, 5, 4, "Diablo", "Lemon-Pepper", "Boneless", "Vanilla", "Strawberry");
		System.out.println(pmp.toString());
		System.out.println("Cost: $" + pmp.getCost());
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> master
