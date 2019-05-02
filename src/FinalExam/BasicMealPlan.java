package FinalExam;

import java.util.ArrayList;

public class BasicMealPlan {
	
	private int numPizzas, numSoda, numToppings;
	private final int COST = 65;
	
	private ArrayList<String> toppingsList = new ArrayList<>();
	
	public BasicMealPlan(int np, int ns, int nt)
	{
		numPizzas = np;
		numSoda = ns;
		numToppings = nt;
	}

	public void setNumPizza(int np)
	{
		numPizzas = np;
	}
	
	public void setNumSoda(int ns)
	{
		numSoda = ns;
	}
	
	public void setNumToppings(int nt)
	{
		numToppings = nt;
	}
	
	public int getNumPizzas()
	{
		return numPizzas;
	}
	
	public int getNumSoda()
	{
		return numSoda;
	}
	
	public int getNumToppings()
	{
		return numToppings;
	}
	
	public void addTopping(String t)
	{
		toppingsList.add(t);
	}
	
	public void displayToppings()
	{
		for(int x = 0; x < toppingsList.size(); x++)
		{
			System.out.print(toppingsList.get(x));
			if(x != toppingsList.size() - 1)
				System.out.print(", ");
		}
	}
	
	public int getCost()
	{
		return COST;
	}
	
	public String toString()
	{
		return numPizzas + " XL " + numToppings + " Topping Gourmet Pizzas, " + numSoda + " 2L Soda Bottles";
	}
	
}
