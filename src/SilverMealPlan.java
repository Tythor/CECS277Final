
public class SilverMealPlan extends BronzeMealPlan {
	
	public SilverMealPlan(int np, int ns, int nt, boolean s, boolean b)
	{
		super(np, ns, nt, s, b);
	}

	private String toString()
	{
		return super.toString() + ", salad";
	}
}
