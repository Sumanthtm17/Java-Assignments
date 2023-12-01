class Operators 
{
	static void add()
	{
		int a=100;
		int b=50;
		int c=a+b;
		System.out.println(c);
	}
	static void subtract()
	{
		int s=100;
		int t=50;
		int u=s-t;
		System.out.println(u);
	}
	static void multiply()
	{
		int x=10;
		int y=5;
		int z=x*y;
		System.out.println(z);
	}
	static void div()
	{
		int d=10;
		int e=2;
		int f=d/e;
		System.out.println(f);
	}
	static void modulus()
	{
		int h=10;
		int i=2;
		int j=h%i;
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		System.out.println("Arithmetic operators start from");
		System.out.println("Add");
		add();
		System.out.println("Subtraction");
        subtract();
		System.out.println("Multiplication");
		multiply();
		System.out.println("Division");
		div();
		System.out.println("Modulus");
		modulus();
			
		}
}
