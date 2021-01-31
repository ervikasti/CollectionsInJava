import java.util.ArrayList;
import java.util.Scanner;
class MenuCard 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList food = new ArrayList();

		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Add name of Food");
			food.add(sc.nextLine());
		}

		
		System.out.println(food);

		//Price of Food
		ArrayList price = new ArrayList();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Add PRICE of Food Respectively");
			price.add(sc.nextLine());
		}
		
		System.out.println(price);

		//Time to cook
		ArrayList time = new ArrayList();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Add Time consume to serve Food Respectively");
			time.add(sc.nextLine());
		}
		System.out.println(time);
		//Displaying Name and Price
		System.out.println("THE MENU CARD ");
		System.out.println("Food"+" "+"Price");
		for (int i=0;i<5 ;i++ )
		{	
			System.out.println(food.get(i) +"     "+price.get(i));	
		}


	}
}
