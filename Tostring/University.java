package tostring;

public class University  
{
	String course_name;
	String University_name;
	int exam_cost;
	University(String course_name,String University_name,int exam_cost)
	{
		this.course_name=course_name;
		this.University_name=University_name;
		this.exam_cost=exam_cost;	
	}
	public String toString()
	{
		return this.course_name+" "+this.University_name+" "+this.exam_cost;
	}
	public static void main(String[] args) {
		University u=new University("Java full stack","J Spiders",40000);
		System.out.println(u.toString());
	}

}
