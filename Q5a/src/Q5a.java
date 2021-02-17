class commonResource
{
	synchronized public void dispPrime(int a,int b)
	{
		
		for(int i=a;i<b;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
				if(i%j==0)
					{
						flag=false;
						break;
					}
					
		if(flag)
		System.out.println("Prime Number:"+i);
		}
	}
}
class t1 extends Thread
{
	commonResource r;
	t1(commonResource r)
	{
		this.r=r;
	}
	public void run()
	{
		r.dispPrime(2, 100);
	}
}
class t2 extends Thread
{
	commonResource r;
	t2(commonResource r)
	{
		this.r=r;
	}
	public void run()
	{
		r.dispPrime(101, 200);
	}
}
public class Q5a {
	public static void main(String [] args) {
	commonResource s=new commonResource();
	t1 T1=new t1(s);
	t2 T2=new t2(s);
	T1.start();
	T2.start();
	}
	
}
