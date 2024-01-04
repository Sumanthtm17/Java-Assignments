package tostring;

public class Employee
{
	int Empid;
	double salary;
	char grade;
	Employee(int Empid,double salary,char grade)
	{
		this.Empid=Empid;
		this.salary=salary;
		this.grade=grade;
	}
public String toString()
{
 return this.Empid+" "+this.salary+" "+this.grade;	
}
public static void main(String[] args) 
{
	Employee e1=new Employee(87565,56789.9,'A');
	System.out.println(e1.toString());
}
}


