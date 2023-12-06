class Course 
{
	String coursename;
	String uniname;
	int examcost;
	
	Course(String a,String b,int c)
	{
		coursename=a;
	    uniname=b;
	    examcost=c;
	    return;
	}
	public static void main(String[] args) 
	{
		System.out.println("Course Details");
		Course c=new Course("Civil","Reva University",2500);
			
			System.out.println("Course name is"+c.coursename);
		    System.out.println("University name is"+c.uniname);
		    System.out.println("Course Exam cost is"+c.examcost);
		

	}
}
