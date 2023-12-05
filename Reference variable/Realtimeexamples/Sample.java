class Sample
{
    static String modelName = "Oneplus";
    int cost;
    String color;

    static String carModelName = "Toyota Fortuner";  
    int carCost;
    String carType; 
	
	static String Schoolname="Standard English School";
	char Grade;
	int Strength;

	static String Tvbrand="LG";
	int Tvcost;
	String Tvtype;

	static String Bikebrand="Royal Enfield";
	int Bikecost;
	String Bikecolor;

	static String Coursename="Civil Engineering";
	int Examcost;
	String Universityname;

    static String Laptopbrand="Xiaomi";
	int Laptopcost;
	String Laptopname;

    static String Homename="TMS";
	int Homecost;
	String Homecolor;


    static String Emp_id="984585";
	int Emp_sal;
	char Emp_grade;


    static String Clothcolor="White"; 
	int Clothcost;
	String Clothsize;

    public static void main(String[] args) 
	{
        System.out.println("Mobile Model name is ");

        Sample mob1 = new Sample();
        mob1.modelName = "Oneplus";
        System.out.println(mob1.modelName);

        mob1.cost = 50000;
        System.out.println(mob1.cost);

        mob1.color = "Skyblue";
        System.out.println(mob1.color);
		System.out.println(  );

        System.out.println("Car Model name is " );

        Sample car1 = new Sample();
        car1.carModelName = "Toyota Fortuner";
        System.out.println(car1.carModelName);

        car1.carCost = 6379000;
        System.out.println(car1.carCost);

        car1.carType = "Petrol/Diesel";
        System.out.println(car1.carType);
		System.out.println(  );

		System.out.println("School is ");

        Sample sch1 = new Sample();
        sch1.Schoolname = "Standard English School";
        System.out.println(car1.Schoolname);

        sch1.Grade = 'A';
        System.out.println(sch1.Grade );

        sch1.Strength=5000 ;
        System.out.println(sch1.Strength );
		System.out.println(  );

		System.out.println("Tv Brand is");

		Sample tv1=new Sample();
		tv1.Tvbrand="LG";
		System.out.println(tv1.Tvbrand);

		tv1.Tvcost=126789;
		System.out.println(tv1.Tvcost);

		tv1.Tvtype="4KOLED";
		System.out.println(tv1.Tvtype);
		System.out.println(  );

		System.out.println("Bike Brand is");

		Sample b1=new Sample();
		b1. Bikebrand="Royal Enfield";
		System.out.println(b1.Bikebrand);

		b1.Bikecost=256987;
		System.out.println(b1.Bikecost);

		b1.Bikecolor="Matt Black";
		System.out.println(b1.Bikecolor);
		System.out.println(  );

		System.out.println("Course name");

		Sample c1=new Sample();
		c1. Coursename="Civil Engineering";
		System.out.println(c1.Coursename);

		c1.Examcost=2600;
		System.out.println(c1.Examcost);

		c1.Universityname="Reva University";
		System.out.println(c1.Universityname);
		System.out.println(  );

		System.out.println("Laptop Brand");

		Sample l1=new Sample();
		l1. Laptopbrand="Xiaomi";
		System.out.println(l1.Laptopbrand);

		l1.Laptopcost=86000;
		System.out.println(l1.Laptopcost);

		l1.Laptopname="Notebook pro 120g";
		System.out.println(l1.Laptopname);
		System.out.println(  );

		System.out.println("Home name is");

		Sample h1=new Sample();
		h1. Homename="TMS";
		System.out.println(h1.Homename);

		h1.Homecost=20000000;
		System.out.println(h1.Homecost);

		h1.Homecolor="Light orange";
		System.out.println(h1.Homecolor);
		System.out.println(  );

		System.out.println("Employee Id");

		Sample e1=new Sample();
		e1. Emp_id="984585";
		System.out.println(e1.Emp_id);

		e1.Emp_sal=500000;
		System.out.println(e1.Emp_sal);

		e1.Emp_grade='A';
		System.out.println(e1.Emp_grade);
		System.out.println(  );

		System.out.println("Cloth Details");

		Sample cl1=new Sample();
		cl1. Clothcolor="White";
		System.out.println(cl1.Clothcolor);

		cl1.Clothcost=2000;
		System.out.println(cl1.Clothcost);

		cl1.Clothsize="M,L,XL";
		System.out.println(cl1.Clothsize);
		System.out.println(  );
    }
}
