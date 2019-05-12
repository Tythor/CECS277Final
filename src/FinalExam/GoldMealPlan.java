package FinalExam;

public class GoldMealPlan extends SilverMealPlan{
	
	protected String wingFlavor1, wingFlavor2, wingType;
	
	private final int COST = 120; 

	/**
	 * default constructor
	 * **/
	public GoldMealPlan() {
		numPizzas = 3;
		numSoda = 5;
		numToppings = 3;
		salad = "Salad";
		breadsticks = "Breadsticks";
		wingFlavor1 = "Choice of chicken wing flavor #1";
		wingFlavor2 = "choice of chicken wing flavor #2";
		wingType = "boneless or bone-in";
	}
	
	/**
	 * Constructor which sets the number of pizzas, number of soda bottles, number of toppings, two flavors of wings, and type of wings
	 * @param np represents the number of pizzas
	 * @param ns represents the number of soda bottles
	 * @param nt represents the number of toppings
	 * @param wf1 represents the first flavor of wings
	 * @param wf2 represents the second flavor of wings
	 * @param wt represents the type of wings 
	 */
	public GoldMealPlan(int np, int ns, int nt, String wf1, String wf2, String wt)
	{
		super(np, ns, nt, "Salad", "Breadsticks");
		
		wingFlavor1 = wf1;
		wingFlavor2 = wf2;
		wingType = wt;
	}
	
	
	/**
	 * method that sets the first flavor of wings
	 * @param f1 represents the first flavor of wings
	 */
	public void setFlavor1(String f1)
	{
		wingFlavor1 = f1;
	}
	
	/**
	 * method that sets the second flavor of wings
	 * @param f2 represents the second flavor of wings 
	 */
	public void setFlavor2(String f2)
	{
		wingFlavor2 = f2;
	}
	
	/**
	 * method that sets the type of wings 
	 * @param wt represents the type of wings
	 */
	public void setWingType(String wt)
	{
		wingType = wt;
	}
	
	/**
	 * method that returns the first flavor of wings
	 * @return a String representing the first flavor of wings 
	 */
	public String getFlavor1()
	{
		return wingFlavor1;
	}
	
	/**
	 * method that returns the second flavor of wings
	 * @return a String representing the second flavor of wings
	 */
	public String getFlavor2()
	{
		return wingFlavor2;
	}
	
	/**
	 * method that returns the type of wings
	 * @return a String representing the type of wings
	 */
	public String getWingType()
	{
		return wingType;
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
	 * method that returns a String representation of the contents of the gold meal plan
	 */
	public String toString()
	{
		return super.toString() + "\n" + wingFlavor1 + " and " + wingFlavor2 + " " + wingType + " Chicken Wings";
	}
	
	/**
	 * main tester for the gold meal plan class
	 * @param args
	 */
	public static void main(String[] args) {
		GoldMealPlan gmp = new GoldMealPlan();
		System.out.println(gmp.toString());
		System.out.println("Cost: $" + gmp.getCost());
	}

}
