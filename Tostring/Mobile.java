package tostring;

public class Mobile 
{
    int mobcost;
    String modelname;
    String color;

    Mobile(int mobcost, String modelname, String color) 
    {
        this.mobcost = mobcost;
        this.modelname = modelname;
        this.color = color;
    }

    public String toString()
    {
        return this.mobcost + " " + this.modelname + " " + this.color;
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile(140000, "Samsung s23 ultra", "Black");
        System.out.println(m1.toString());
        Mobile m2=new Mobile(50000,"Oneplus 9","Skyblue");
        System.out.println(m2.toString());
    }
}
