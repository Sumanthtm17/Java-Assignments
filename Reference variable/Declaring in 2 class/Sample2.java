class Demo2
{
	
    void triangle(int b, int h) 
	{
        double res1=0.5*b*h;
        System.out.println(res1);
    }

    void rectangle(int w, int h) 
    {
        int res2=w*h;
        System.out.println(res2);
    }

    void trapezoid(int a, int b, int h) 
	{
        double res3=0.5*(a+b)*h;
        System.out.println(res3);
    }

    void ellipse(int a, int b) 
	{
        final double pi=3.142;
        double res4=pi*a*b;
        System.out.println(res4);
    }

    void square(int a)
	{
        int res5=a*a;
        System.out.println(res5);
    }

    void parallelogram(int b, int h) 
	{
        int res6=b*h;
        System.out.println(res6);
    }

    void circle(int r) 
	{
        final double pi = 3.142;
        double res7=pi*r*r;
        System.out.println(res7);
    }

    void sector(int r) 
	{
        double t=30.5;
        double res8=0.5*r*r*t;
        System.out.println(res8);
    }
}
	class Sample2
	{
    public static void main(String[] args) 
	    {
        System.out.println("Triangle");
		Demo2 s2=new Demo2();
		s2.triangle(5,7);
        System.out.println("Rectangle");
		s2.rectangle(10,5);
        System.out.println("Trapezoid");
        s2.trapezoid(10,18,5);
        System.out.println("Ellipse");
        s2.ellipse(5,5);
		System.out.println("Square");
        s2.square(5);
        System.out.println("Parallelogram");
        s2.parallelogram(10,5);
        System.out.println("Circle");
        s2.circle(5);
        System.out.println("Sector");
        s2.sector(5);
	    }
	}