package tostring;

public class Tv {
	int cost;
	String brand;
	String type;
	Tv(int cost,String brand,String type)
	{
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
public String toString()
{
 return this.cost+" "+this.brand+" "+this.type;	
}
public static void main(String[] args) 
{
	Tv t1=new Tv (167543,"LG","OLED");
	System.out.println(t1.toString());
}
}
