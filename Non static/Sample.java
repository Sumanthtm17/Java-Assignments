class Sample
{
	void triangle()
	{
		int b=5;
		int h=7;
		double res1=0.5*b*h;
		System.out.println(res1);
	}
	void rectangle()
	{
		int w=10;
		int h=5;
		int res2=w*h;
		System.out.println(res2);
	}
	void trapezoid()
	{
		int a=10;
		int b=18;
		int h=5;
		double res3=0.5*(a+b)*h;
		System.out.println(res3);
	}
	void ellipse()
	{
		int a=5;
		int b=5;
		final double pi=3.142;
		double res4=pi*a*b;
		System.out.println(res4);
	}
    void square()
	{
		int a=5;
		int res5=a*a;
		System.out.println(res5);
	}
	void parallelogram()
	{
		int b=10;
		int h=5;
		int res6=b*h;
		System.out.println(res6);
	}
	void circle()
	{
		int r=5;
		final double pi=3.142;
		double res7=pi*r*r;
		System.out.println(res7);
	}
	void sector()
	{
		int r=5;
		double t=30.5;
		double res8=0.5*r*r*t;
		System.out.println(res8);
	}

	public static void main(String[] args)
	{
		System.out.println("Triangle");
		new Sample().triangle();
		System.out.println("Rectangle");
		new Sample().rectangle();
		System.out.println("Trapezoid");
		new Sample().trapezoid();
		System.out.println("Ellipse");
		new Sample().ellipse();
		System.out.println("Square");
		new Sample().square();
		System.out.println("Parallelogram");
		new Sample().parallelogram();
		System.out.println("Circle");
		new Sample().circle();
		System.out.println("Sector");
		new Sample().sector();
	}
}
