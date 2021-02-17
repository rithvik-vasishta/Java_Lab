class age extends Exception
{
	age(String s)
	{
		super(s);
	}
}
class cgpa extends Exception
{
	cgpa (String s)
	{
		super(s);
	}
}

public class Q6a {
	public static void main(String [] args)
	{
		int age;
		double c;
		age=24;
		c=7;
		try
		{
			if(age>25)
				throw(new age("Age exceeded"));
			
			try
			{
				if(c<8)
					throw(new cgpa("cgpa not met"));
				System.out.println("Accepted");
			}
			catch(cgpa e)
			{
				System.out.println(e);
			}
		}
		catch(age e)
		{
			System.out.println(e);
		}
	}

}
