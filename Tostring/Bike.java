package tostring;

public class Bike 
{
	int cost;
	String brand;
	String color;
	Bike(int cost,String brand,String color)
	{
		this.cost=cost;
		this.brand=brand;
		this.color=color;	
	}
	public String toString()
	{
		return this.cost+" "+this.brand+" "+this.color;
	}
	public static void main(String[] args) {
		Bike b1=new Bike(256788,"ROyal Enfield","Matt Black");
		System.out.println(b1.toString());
	}

}
