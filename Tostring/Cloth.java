package tostring;

public class Cloth
{
	String color;
	int cost;
	String size;
	Cloth(String color,int cost,String size)
	{
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
public String toString()
{
 return this.color+" "+this.cost+" "+this.size;	
}
public static void main(String[] args) 
{
	Cloth c1=new Cloth("Nike",999,"L");
	System.out.println(c1.toString());
	Cloth c2=new Cloth("Puma",1200,"XL");
	System.out.println(c2.toString());
}
}

