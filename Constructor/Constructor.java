class Constructor
{
	String mobcolor;
    int mobcost;
    String mobname;
	Constructor(String a,int b,String c)
	{
		mobcolor=a;
		mobcost=b;
		mobname=c;
		return;
	}
	String carmodel;
	int carcost;
	String carfuel;
	Constructor(int d,String e,String f)
	{
		carcost=d;
	    carmodel=e;
	    carfuel=f;
	    return;
	}
	String schname;
	char schgrade;
	int schstrength;
	Constructor(String g,char h,int i)
	{
		schname=g;
	    schgrade=h;
	    schstrength=i;
	    return;
	}
	 public static void main(String[] args) 
	{
		System.out.println("Mobile Phone");
		Constructor Mob=new Constructor("Blue",50000,"Oneplus");
			
			System.out.println("Mobile color is"+Mob.mobcolor);
		    System.out.println("Mobile color is"+Mob.mobcost);
		    System.out.println("Mobile color is"+Mob.mobname);
			System.out.println( );

		System.out.println("Car Details");
		Constructor ca=new Constructor(9400000,"B M W","Diesel");
			
			System.out.println("Mobile color is"+ca.carmodel);
		    System.out.println("Mobile color is"+ca.carcost);
		    System.out.println("Mobile color is"+ca.carfuel);
			System.out.println( );

		System.out.println("School Details");
		Constructor sch=new Constructor("S E S",'A',5000);
			
			System.out.println("School name is"+sch.schname);
		    System.out.println("School grade is"+sch.schgrade);
		    System.out.println("School strenghth is"+sch.schstrength);
			System.out.println( );
	}
}
