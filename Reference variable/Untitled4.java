class Sample3
{
    double triangle() 
    {
        int b=5;
        int h=7;
        double res=0.5*b*h;
        return res;
    }
    public static void main(String[] args) 
	{
        System.out.println("Triangle");
		Sample3 s3=new Sample3();
        double s=s3.triangle();
        System.out.println(s);
	}
}