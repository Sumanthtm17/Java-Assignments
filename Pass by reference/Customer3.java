class Taxi
{
	void ola()
	{
		System.out.println("Book a Taxi");
	}
}
class Ola
{
static void booking(Taxi t1)
	{
		t1.ola();
	}
}
class Customer3
{
	public static void main(String[] args) 
	{
	  Taxi t1=new Taxi();
	  Ola.booking(t1);
	}
}
