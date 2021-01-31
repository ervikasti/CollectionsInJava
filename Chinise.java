import java.util.ArrayList;

class Chinise
{
	static ArrayList food = new ArrayList();
	public static void main(String[] args) 
	{
		ArrayList chinese = new ArrayList();
		chinese.add("Chinese Bhel");
		chinese.add("Chinese Manchurian");
		chinese.add("Chines Noodles");
		chinese.add(0,"Chinese Soup");//passing index no with object
		food.addAll(chinese);
		//System.out.println(chinese);
	}
}

