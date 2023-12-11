class Sbi
{
    void transfer()
    {
        System.out.println("Money transfer");
    }
}

class Phonepe
{
    static void transaction(Sbi s2)
    {
        s2.transfer(); 
    }
}

class Customer1
{
    public static void main(String[] args)
    {
        Sbi s1=new Sbi();
		Phonepe.transaction(s1);
    }
}
