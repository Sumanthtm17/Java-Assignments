class Assignment 
{
    static double triangle() 
    {
        int b=5;
        int h=7;
        return 0.5*b*h;
    }

    static int rectangle() 
	{
        int w =10;
        int h =5;
        return w*h;
    }

    static double trapezoid() 
	{
        int a = 10;
        int b = 18;
        int h = 5;
        return 0.5*(a+b)*h;
    }

    static double ellipse() 
	{
        int a=5;
        int b=5;
        final double pi=3.142;
        return pi*a*b;
    }

    static int square() 
	{
        int a=5;
        return a*a;
    }

    static int parallelogram() 
	{
        int b=10;
        int h=5;
        return b*h;
    }

    static double circle() 
	{
        int r=5;
        final double pi=3.142;
        return pi*r*r;
    }

    static double sector() 
	{
        int r=5;
        double t=30.5;
        return 0.5*r*r*t;
    }
}

class Result_1 
{
    public static void main(String[] args) 
	{
        System.out.println("Triangle");
        double s=Assignment.triangle();
        System.out.println(s);

        System.out.println("Rectangle");
        int t=Assignment.rectangle();
        System.out.println(t);

        System.out.println("Trapezoid");
        double u=Assignment.trapezoid();
        System.out.println(u);

        System.out.println("Ellipse");
        double v=Assignment.ellipse();
        System.out.println(v);

        System.out.println("Square");
        int w=Assignment.square();
        System.out.println(w);

        System.out.println("Parallelogram");
        int x=Assignment.parallelogram();
        System.out.println(x);

        System.out.println("Circle");
        double y=Assignment.circle();
        System.out.println(y);

        System.out.println("Sector");
        double z=Assignment.sector();
        System.out.println(z);
    }
}
