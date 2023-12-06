class Cloth 
{
	String color;
	int cost;
	String size;
	
	Cloth(String a,int b,String c)
	{
		color=a;
	    cost=b;
	    size=c;
	    return;
	}
	public static void main(String[] args) 
	{
		System.out.println("Cloth Details");
		Cloth c=new Cloth("White",2000,"M,L,XL");
			
			System.out.println("Cloth color is"+c.color);
		    System.out.println("Cloth cost is"+c.cost);
		    System.out.println("Cloth size"+c.size);
		

	}
}