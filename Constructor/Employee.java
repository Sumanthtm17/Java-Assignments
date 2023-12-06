class Employee 
{
	int id;
	double sal;
	char grade;
	
	Employee(int a,double b,char c)
	{
		id=a;
	    sal=b;
	    grade=c;
	    return;
	}
	public static void main(String[] args) 
	{
		System.out.println("Employee Details");
		Employee e=new Employee(9845,500000,'A');
			
			System.out.println("Employee id is"+e.id);
		    System.out.println("Employee salary is"+e.sal);
		    System.out.println("Employee grade"+e.grade);
		

	}
}