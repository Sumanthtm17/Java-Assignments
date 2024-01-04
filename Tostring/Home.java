package tostring;

public class Home
{
	String Name;
	int cost;
	String color;
	Home(String Name,int cost,String color)
	{
		this.Name=Name;
		this.cost=cost;
		this.color=color;
	}
public String toString()
{
 return this.Name+" "+this.cost+" "+this.color;	
}
public static void main(String[] args) 
{
	Home h1=new Home ("Sumanth",25000000,"Orange");
	System.out.println(h1.toString());
}
}

