class Demo2
{
    double triangle() 
    {
        int b=5;
        int h=7;
        return 0.5*b*h;
    }

    int rectangle() 
	{
        int w =10;
        int h =5;
        return w*h;
    }

    double trapezoid() 
	{
        int a = 10;
        int b = 18;
        int h = 5;
        return 0.5*(a+b)*h;
    }

    double ellipse() 
	{
        int a=5;
        int b=5;
        final double pi=3.142;
        return pi*a*b;
    }

    int square() 
	{
        int a=5;
        return a*a;
    }

    int parallelogram() 
	{
        int b=10;
        int h=5;
        return b*h;
    }

    double circle() 
	{
        int r=5;
        final double pi=3.142;
        return pi*r*r;
    }

    double sector() 
	{
        int r=5;
        double t=30.5;
        return 0.5*r*r*t;
    }
    public static void main(String[] args) 
	{
        System.out.println("Triangle");
        double s=new Demo2().triangle();
        System.out.println(s);

        System.out.println("Rectangle");
        int t=new Demo2().rectangle();
        System.out.println(t);

        System.out.println("Trapezoid");
        double u=new Demo2().trapezoid();
        System.out.println(u);

        System.out.println("Ellipse");
        double v=new Demo2().ellipse();
        System.out.println(v);

        System.out.println("Square");
        int w=new Demo2().square();
        System.out.println(w);

        System.out.println("Parallelogram");
        int x=new Demo2().parallelogram();
        System.out.println(x);

        System.out.println("Circle");
        double y=new Demo2().circle();
        System.out.println(y);

        System.out.println("Sector");
        double z=new Demo2().sector();
        System.out.println(z);
    }
}