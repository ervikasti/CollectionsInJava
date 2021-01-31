import java.util.ArrayList;
class UniqueCommon 
{
	static{
		System.out.println("In this Program you have to enter 5 food name in set of 2");
	}

	public static void main(String[] args) 
	{
		//First List
		ArrayList list1 = MenuCard2.food();
		System.out.println("SECOND LIST START");
		//Second List
		ArrayList list2 = MenuCard2.food();

		//Checking for common food
		list1.retainAll(list2);
		System.out.println("COMMON FOOD"+list1);
		System.out.println(list1);

		//Checking for Uniqe food
		list2.removeAll(list1);
		System.out.println("UNIQUE FOOD"+list2);

	}
}
