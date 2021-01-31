import java.util.ArrayList;
class Triple
{
	public static void main(String[] args) 
	{
		ArrayList Food = new ArrayList();
		SouthFood.main(null);
		System.out.println("South Food");
		Food.addAll(SouthFood.sFood);
		System.out.println(SouthFood.sFood);
		NorthFood.main(null);
		System.out.println("North Food ");
		Food.addAll(NorthFood.nFood);
		System.out.println(NorthFood.nFood);
		Chinise.main(null);
		System.out.println("Chinese Food ");
		Food.addAll(Chinise.food);
		System.out.println(Chinise.food);
		System.out.println("\n Food ");
		System.out.println(Food);
	}
}
