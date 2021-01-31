import java.util.ArrayList;

class NorthFood
{
	static ArrayList nFood = new ArrayList();
	public static void main(String[] args) 
	{
		ArrayList nfood = new ArrayList();
		nfood.add("Simple Samosa");
		nfood.add("Masala Chaat");
		nfood.add("PaniPuri");
		nfood.add(0,"Chole Kulche");//passing index no with object
		nFood.addAll(nfood);
		//System.out.println(nfood);

	}
}

