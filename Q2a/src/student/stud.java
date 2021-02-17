package student;
import java.util.*;
public class stud {
	private int sn;
	private String deptname,g1,g2,g3;
	private double sgpa;
	public stud(int sn,String name,String a1,String a2,String a3,double s)
	{
		this.sn=sn;
		deptname=name;
		g1=a1;g2=a2;g3=a3;sgpa=s;
	}
	public void display()
	{
		System.out.println(" USN : "+ sn+"\n Department name :"+ deptname + "\n Grade 1   "+g1+"\n Grade 2 "+g2+"\n Grade 3 "+g3+"\n SGPA: "+sgpa);
	}


}
