class Cars 
{
	void booking()
	{
		System.out.println("Cars Overlooking");
	}
}
class Olx
{
	static void Booking (Cars c1)
	{
		c1.booking();
	}
}
class Customer4
{
	public static void main(String[] args) 
	{
		Cars c1=new Cars();
		Olx.Booking(c1);
	}
}
