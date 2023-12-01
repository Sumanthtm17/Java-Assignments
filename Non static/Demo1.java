class Demo1 
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

    public static void main(String[] args) 
		{
        System.out.println("Triangle");
        new Demo1().triangle(5,7);

        System.out.println("Rectangle");
        new Demo1().rectangle(10,5);

        System.out.println("Trapezoid");
        new Demo1().trapezoid(10,18,5);

        System.out.println("Ellipse");
        new Demo1().ellipse(5,5);

        System.out.println("Square");
        new Demo1().square(5);

        System.out.println("Parallelogram");
        new Demo1().parallelogram(10,5);

        System.out.println("Circle");
        new Demo1().circle(5);

        System.out.println("Sector");
        new Demo1().sector(5);
    }
}