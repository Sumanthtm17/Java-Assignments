class Sample1 
{
	void triangle()
	{
		int b=5;
		int h=7;
		double res=0.5*b*h;
		System.out.println(res);
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
		int a=8;
		int b=10;
		int h=5;
		double res3=0.5*(a+b)*h;
		System.out.println(res3);
	}
	void ellipse()
	{
		int a=5;
		int b=6;
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
		System.out.println("Area of Triangle");
		Sample1 s1=new Sample1();
		s1.triangle();
		System.out.println("Area of Rectangle");
		s1.rectangle();
		System.out.println("Area of Trapezoid");
		s1.trapezoid();
		System.out.println("Area of Ellipse");
		s1.ellipse();
		System.out.println("Area of Square");
		s1.square();
		System.out.println("Area of Parallelogram");
		s1.parallelogram();
		System.out.println("Area of Circle");
		s1.circle();
		System.out.println("Area of Sector");
		s1.sector();

	}
}
