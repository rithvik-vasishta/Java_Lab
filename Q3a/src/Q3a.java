import java.util.Scanner;

class NameNotCorrect extends Exception
{
	NameNotCorrect(String s)
	{
		super(s);
	}
}
class AgeLimitException extends Exception
{
	AgeLimitException(String s)
	{
		super(s);
	}
}
class emp
{
	int n;
	String name;
	emp(int m,String o)
	{
		n=m;
		name=o;
	}
	public String toString()
	{
		return("Name:"+name+" Age:"+n);
	}
}
public class Q3a {
	   public static void main(String [] args)
	   {
		   try
		   {
			   int age;
			   String name;
			   Scanner input=new Scanner(System.in);
			   System.out.println("Enter Name:");
			   name=input.next();
			   System.out.println("Enter age:");
			   age=input.nextInt();
			   for(int i=0;i<name.length();i++)
			   {
				   if(Character.isDigit(name.charAt(i)))
					   throw ( new NameNotCorrect("Please Enter only numbers") );
			   }
			   if(age>50)
				   throw(new AgeLimitException("You're over aged"));
			   emp e=new emp(age,name);
			   System.out.println(e);
		   }
		   catch(NameNotCorrect e)
		   {
			   System.out.println(e);
		   }
		   catch(AgeLimitException e)
		   {
			   System.out.println(e);
		   }
	   }

}
