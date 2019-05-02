package FinalExam;

public class BronzeMealPlan extends BasicMealPlan {
	
	private boolean salad, breadsticks;
	
	public BronzeMealPlan(int np, int ns, int nt, boolean s, boolean b)
	{
		super(np, ns, nt);
		
		salad = s;
		breadsticks = b;
	}
	
	public void setSalad(boolean s)
	{
		salad = s;
	}
	
	public void setBreadsticks(boolean b)
	{
		breadsticks = b;
	}
	
	public boolean getSalad()
	{
		return salad;
	}
	
	public boolean getBreadsticks()
	{
		return breadsticks;
	}

	public String toString()
	{
		
		if(salad == true)
			return 	super.toString() + ", Salad";
		else
			return super.toString() + ", Breadsticks";
	}
	
}
