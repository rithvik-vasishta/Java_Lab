package AdvMath;

public class trip {	
	public void tr(int lim)
	{
		for(int a=1;a<=lim;a++)
			for(int b=a;b<=lim;b++)
				for(int c=b;c<=lim;c++)
					if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2))
						System.out.println(a+" "+b+" "+c);
	}

}
