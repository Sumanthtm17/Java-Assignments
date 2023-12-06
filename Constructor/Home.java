class Home 
{
	String name;
	int cost;
	String color;
	
	Home(String a,int b,String c)
	{
		name=a;
	    cost=b;
	    color=c;
	    return;
	}
	public static void main(String[] args) 
	{
		System.out.println("Home Details");
		Home h=new Home("T M S",20000000,"Light orange");
			
			System.out.println("Home name is"+h.name);
		    System.out.println("Home cost is"+h.cost);
		    System.out.println("Home brand is"+h. color);
		

	}
}