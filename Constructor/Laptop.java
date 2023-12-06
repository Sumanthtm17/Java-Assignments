class Laptop 
{
	String name;
	int cost;
	String brand;
	
	Laptop(String a,int b,String c)
	{
		name=a;
	    cost=b;
	    brand=c;
	    return;
	}
	public static void main(String[] args) 
	{
		System.out.println("Laptop Details");
		Laptop l=new Laptop("Xiaomi",85000,"Notebook pro 120g");
			
			System.out.println("Laptop name is"+l.name);
		    System.out.println("Laptop cost is"+l.cost);
		    System.out.println("Laptop brand is"+l. brand);
		

	}
}