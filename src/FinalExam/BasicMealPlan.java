package FinalExam;

import java.util.ArrayList;

public class BasicMealPlan {
	
	protected int numPizzas, numSoda, numToppings;
	private final int COST = 65;

	private ArrayList<String> toppingsList = new ArrayList<>();
	
	/**
	 * default constructor
	 * **/
	public BasicMealPlan() {
		numPizzas = 3;
		numSoda = 3;
		numToppings = 1;
	}
	
	/**
	 * Constructor which sets the number of pizzas, number of soda bottles, and number of toppings
	 * @param np represents the number of pizzas
	 * @param ns represents the number of soda bottles
	 * @param nt represents the number of toppings
	 */
	public BasicMealPlan(int np, int ns, int nt)
	{
		numPizzas = np;
		numSoda = ns;
		numToppings = nt;
	}

	/**
	 * method that sets the number of pizzas included in the meal plan
	 * @param np represents the number of pizzas 
	 */
	public void setNumPizza(int np)
	{
		numPizzas = np;
	}
	
	/**
	 * method that sets the number of soda bottles
	 * @param ns represents the number of soda bottles
	 */
	public void setNumSoda(int ns)
	{
		numSoda = ns;
	}
	
	/**
	 * method that sets the number of toppings 
	 * @param nt represents the number of toppings 
	 */
	public void setNumToppings(int nt)
	{
		numToppings = nt;
	}
	
	/**
	 * method that returns the number of pizzas
	 * @return an integer representing the number of pizzas
	 */
	public int getNumPizzas()
	{
		return numPizzas;
	}
	
	/**
	 * method that returns the number of soda bottles
	 * @return an integer representing the number of soda bottles
	 */
	public int getNumSoda()
	{
		return numSoda;
	}
	
	/**
	 * method that returns the number of toppings
	 * @return an integer representing the number of toppings
	 */
	public int getNumToppings()
	{
		return numToppings;
	}
	
	/**
	 * method that adds a topping to the arraylist of toppings
	 * @param t represents a topping
	 */
	public void addTopping(String t)
	{
		toppingsList.add(t);
	}
	
	/**
	 * method that displays all the toppings added to the pizzas
	 */
	public void displayToppings()
	{
		for(int x = 0; x < toppingsList.size(); x++)
		{
			System.out.print(toppingsList.get(x));
			if(x != toppingsList.size() - 1)
				System.out.print(", ");
		}
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
	 * method that returns a String representation of the contents of the basic meal plan
	 */
	public String toString()
	{
		return numPizzas + " XL " + numToppings + " Topping Gourmet Pizzas " + "\n" + numSoda + " 2L Soda Bottles";
	}
	
	/**
	 * main tester for the basic meal plan class
	 * @param args
	 */
	public static void main(String[] args) {
		BasicMealPlan bmp = new BasicMealPlan(3, 2, 1);
		System.out.println(bmp.toString());
		System.out.println("Cost: $" + bmp.getCost());
	}
	
}