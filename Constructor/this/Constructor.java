class Constructor
{
	int empid;
	String empname;
	double empsal;
	Constructor(int empid,String empname,double empsal)
	{
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		return;
	}

	int mobilecost;
	String modelname;
	String color;
	Constructor(int mobilecost, String modelname, String color)
	{
		this.mobilecost=mobilecost;
		this.modelname= modelname;
		this.color= color;
		return;
	}

	String model;
	int carcost;
	String type;
	Constructor(String  model,int carcost,String type)
	{
		this.carcost=carcost;
		this.model= model;
		this.type=type;
		return;
	}

	String schlname;
	char grade;
	int strength;
	Constructor(String schlname,char grade,int strength)
	{
		this.schlname=schlname;
		this.grade=grade;
		this.strength=strength;
		return;
	}

	String tvbrand;
	String tvdisplaytype;
	int tvcost;
	Constructor(String tvbrand,String tvdisplaytype,int tvcost)
	{
		this.tvbrand=tvbrand;
		this.tvdisplaytype=tvdisplaytype;
		this.tvcost=tvcost;
		return;
	}

	String bikebrand;
	String bikecolor;
	double bikecost;
	Constructor(String bikebrand,String bikecolor,double bikecost)
	{
		this.bikebrand=bikebrand;
		this.bikecolor=bikecolor;
		this.bikecost=bikecost;
		return;
	}

	String course;
	String uniname;
	float fee;
	Constructor(String course,String uniname,float fee)
	{
		this.course=course;
		this.uniname=uniname;
		this.fee=fee;
		return;
	}

	String cloth;
	int clothcost;
	char size;
	Constructor(String cloth,int clothcost,char size)
	{
		this.cloth=cloth;
		this.clothcost=clothcost;
		this.size=size;
		return;
	}

	String lapbrand;
	String lapname;
	float lapcost;
	Constructor(String lapbrand,float lapcost,String lapname)
	{
		this.lapbrand=lapbrand;
		this.lapcost=lapcost;
		this.lapname=lapname;
		return;
	}

	double homecost;
	String homename;
	String homecolour;
	Constructor(double homecost,String homename,String homecolour)
	{
		this.homecost=homecost;
		this.homename=homename;
		this.homecolour=homecolour;
		return;
	}

	public static void main(String[] args)
	{
		System.out.println("Employee Details");
		Constructor Emp=new Constructor(984585,"Sumanth T M",500000.66);
		System.out.println(Emp.empid);
		System.out.println(Emp.empname);
		System.out.println(Emp.empsal);
		System.out.println(" ");

		System.out.println("Mobile Phone");
		Constructor Mob=new Constructor(50000,"Oneplus 9","Sky Blue");
		System.out.println(Mob.mobilecost);
		System.out.println(Mob.modelname);
		System.out.println(Mob.color);
		System.out.println("");

		System.out.println("Car");
		Constructor Car=new Constructor("B M W",9400000,"Diesel");
		System.out.println(Car.model);
		System.out.println(Car.carcost);
		System.out.println(Car.type);
		System.out.println(" ");

		System.out.println("School Details");
		Constructor Schl=new Constructor("Standard English School",'A',2500);
		System.out.println(Schl.schlname);
		System.out.println(Schl.grade);
		System.out.println(Schl.strength);
		System.out.println(" ");

		System.out.println("Tv Details");
		Constructor Tv=new Constructor("L G","OLED",100000);
		System.out.println(Tv.tvbrand);
		System.out.println(Tv.tvdisplaytype);
		System.out.println(Tv.tvcost);
		System.out.println(" ");

		System.out.println("Bike Details");
		Constructor b1=new Constructor("Royal Enfield","Matte Black",256000.12);
		System.out.println(b1.bikebrand);
		System.out.println(b1.bikecolor);
		System.out.println(b1.bikecost);
		System.out.println(" ");

		System.out.println("College Details");
		Constructor Uni=new Constructor("Civil Engineering","Reva University",2500.45f);
		System.out.println(Uni.course);
		System.out.println(Uni.uniname);
		System.out.println(Uni.fee);
		System.out.println(" ");

		System.out.println("US polo");
		Constructor Cloth=new Constructor("Cotton",1000,'L');
		System.out.println(Cloth.cloth);
		System.out.println(Cloth.clothcost);
		System.out.println(Cloth.size);
		System.out.println(" ");

		System.out.println("Laptop Details");
		Constructor Laptop=new Constructor("Xiaomi",85000.99f,"Notebook pro 120g");
		System.out.println(Laptop.lapbrand);
		System.out.println(Laptop.lapcost);
		System.out.println(Laptop.lapname);
		System.out.println(" ");

		System.out.println("Home");
		Constructor Home=new Constructor(20000000.98,"T M S","Light orange");
		System.out.println(Home.homecost);
		System.out.println(Home.homename);
		System.out.println(Home.homecolour);
	}
}