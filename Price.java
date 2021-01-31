import java.util.ArrayList;
import java.util.Scanner;
class Price
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//First List
		ArrayList list1 = MenuCard2.food("pre");
		System.out.println(list1);
		//Second List
		System.out.println("Enter the Food name to get price");
		String s1 =sc.nextLine();
		boolean a = true;
		for (int i=0;i<list1.size() ;i++ )
		{
			if (s1.equals(list1.get(i)) && a)
			{
				a = false;
				System.out.println("The price of "+list1.get(i)+" is "+MenuCard2.price(i));
			}
		}
		

	}
}
