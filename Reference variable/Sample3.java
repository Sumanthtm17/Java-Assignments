class Sample3
{
    double triangle() 
    {
        int b=5;
        int h=7;
		double res1=0.5*b*h;
        return res1;
    }

    int rectangle() 
	{
        int w =10;
        int h =5;
		int res2=w*h;
        return res2;
    }

    double trapezoid() 
	{
        int a = 10;
        int b = 18;
        int h = 5;
		double res3=0.5*(a+b)*h;
        return res3;
    }

    double ellipse() 
	{
        int a=5;
        int b=5;
        final double pi=3.142;
		double res4=pi*a*b;
        return res4;
    }

    int square() 
	{
        int a=5;
		int res5=a*a;
		return res5;
    }

    int parallelogram() 
	{
        int b=10;
        int h=5;
		int res6=b*h;
        return res6;
    }

    double circle() 
	{
        int r=5;
        final double pi=3.142;
		double res7=pi*r*r;
        return res7; 
    }

    double sector() 
	{
        int r=5;
        double t=30.5;
		double res8=0.5*r*r*t;
        return res8; 
    }
    public static void main(String[] args) 
	{
        System.out.println("Triangle");
		Sample3 s3=new Sample3();
        double s=s3.triangle();
        System.out.println(s);

        System.out.println("Rectangle");
        int t=s3.rectangle();
        System.out.println(t);

        System.out.println("Trapezoid");
        double u=s3.trapezoid();
        System.out.println(u);

        System.out.println("Ellipse");
        double v=s3.ellipse();
        System.out.println(v);

        System.out.println("Square");
        int w=s3.square();
        System.out.println(w);

        System.out.println("Parallelogram");
        int x=s3.parallelogram();
        System.out.println(x);

        System.out.println("Circle");
        double y=s3.circle();
        System.out.println(y);

        System.out.println("Sector");
        double z=s3.sector();
        System.out.println(z);
    }
}