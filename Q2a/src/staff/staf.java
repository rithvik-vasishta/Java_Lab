package staff;

public class staf {

	String Staffid, StaffName, Designation, subjects;
	public staf(String i,String n,String d,String s)
{
		Staffid=i;
		StaffName=n;
		Designation=d;
		subjects=s;
	}
	public void display()
	{
		System.out.println("\n Staffid:  "+Staffid+"\n StaffName "+StaffName+"\n Designation "+ Designation +"\n Subject handled "+subjects);
	}
}

