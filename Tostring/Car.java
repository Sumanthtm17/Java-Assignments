package tostring;

public class Car 
{
	int carcost;
	String Modelname;
	String Fueltype;
	Car(int carcost,String Modelname,String Fueltype)
	{
		this.carcost=carcost;
		this.Modelname=Modelname;
		this.Fueltype=Fueltype;
	}
	public String toString()
	{
		return this.carcost+" "+this.Modelname+" "+this.Fueltype;
	}
	public static void main(String[] args)
	{
	  Car c1=new Car(9567858,"BMW_M3","Diesel");
			  System.out.println(c1.toString());
	}
	

}
