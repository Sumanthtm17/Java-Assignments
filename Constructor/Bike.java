class Bike
{
	int bikecost;
	String bikebrand;
	String bikecolor;
	
	Bike(int a,String b,String c)
	{
		bikecost=a;
	    bikebrand=b;
	    bikecolor=c;
	    return;
	}
	public static void main(String[] args) 
	{
		System.out.println("Bike Details");
		Bike b=new Bike(256000,"Royal Enfield","Matt Black");
			
			System.out.println("Bike cost is"+b.bikecost);
		    System.out.println("Bike brand is"+b.bikebrand);
		    System.out.println("Bike color is"+b.bikecolor);
		

	}
}
