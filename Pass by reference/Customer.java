class Amazon
{
    void product()
    {
        System.out.println("Amazon Product");
    }
}

class Ekart
{
    static void delivery(Amazon a2)
    {
        a2.product(); 
    }
}

class Customer
{
    public static void main(String[] args)
    {
        Amazon a1 = new Amazon(); 
        Ekart.delivery(a1);
    }
}
