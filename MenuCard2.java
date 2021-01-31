import java.util.ArrayList;
import java.util.Scanner;
class MenuCard2 
{
	static Scanner sc = new Scanner(System.in);
	public static ArrayList food(){
		ArrayList food = new ArrayList();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Add name of Food");
			food.add(sc.nextLine());
		}
		return food;
	}

	public static ArrayList food(String Pre){
		ArrayList food = new ArrayList();
		food.add("Pav Bhaji");
		food.add("Rice Daal");
		food.add("Chole Fulke");
		food.add("Pani Puri");
		return food;
	}

	public static ArrayList price() 
	{
		//Price of Food
		ArrayList price = new ArrayList();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Add PRICE of Food Respectively");
			price.add(sc.nextLine());
		}
		return price;
	}

		public static Object price(int num) 
	{
		//Price of Food
		ArrayList price = new ArrayList();
		price.add(30);
		price.add(25);
		price.add(35);
		price.add(20);
		return price.get(num);
	}

	public static ArrayList time()
	{
		//Time to cook
		ArrayList time = new ArrayList();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Add Time consume to serve Food Respectively");
			time.add(sc.nextLine());
		}
		return time;
	}

}
