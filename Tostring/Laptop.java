package tostring;

public class Laptop 
{
	String Name;
	int cost;
	String brand;
	
	Laptop(String Name,int cost,String brand)
	{
		this.Name=Name;
		this.cost=cost;
		this.brand=brand;
	}
public String toString()
{
 return this.Name+" "+this.cost+" "+this.brand+" ";	
}
public static void main(String[] args) 
{
	Laptop l1=new Laptop ("Xiaomi",64000,"Notebook ultra pro");
	System.out.println(l1.toString());
}
}

