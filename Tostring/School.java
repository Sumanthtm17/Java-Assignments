package tostring;

public class School 
{
	String Schname;
	char grade;
	int Schstrength;
	School(String Schname,char grade,int Schstrength)
	{
		this.Schname=Schname;
		this.grade=grade;
		this.Schstrength=Schstrength;
	}
public String toString()
{
	return this.Schname+" "+this.grade+" "+this.Schstrength;
}
public static void main(String[] args) {
	School s1=new School("Standard English Schbool",'A',8773);
	System.out.println(s1.toString());
}
}
