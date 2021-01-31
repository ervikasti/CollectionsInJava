import java.util.ArrayList;

class SouthFood
{
	static ArrayList sFood = new ArrayList();
	public static void main(String[] args) 
	{
		ArrayList sfood = new ArrayList();
		sfood.add("Simple Dosa");
		sfood.add("Masala Dosa");
		sfood.add("Idli");
		sfood.add(0,"Uttapam");//passing index no with object
		//System.out.println(sfood); //commenting to access this thing in Combo.java
		sFood.addAll(sfood);
	}
}

