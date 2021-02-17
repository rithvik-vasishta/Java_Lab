class Q
{
	int n;
	boolean flag=false;
	synchronized int getMeal()
	{
		while(!flag)
			try {
				wait();
				Thread.sleep(1000);
			}catch(Exception e) {e.printStackTrace();}
		System.out.println("Got the meal from chef now "+n);
		flag=false;
		notify();
		return n;
	}
	synchronized void putMeal(int n)
	{
		while(flag)
			try {
				wait();
				Thread.sleep(1000);
			}catch(Exception e) {e.printStackTrace();}
		this.n=n;
		flag=true;
		System.out.println("Sending out meal "+n);
		notify();
	}
}
class chef implements Runnable
{
	Q q;
	chef(Q q)
	{
		this.q=q;
		new Thread(this,"chef").start();
	}
	public void run()
	{
		int i=0;
		while(true)
			q.putMeal(i++);
	}
}
class waiter implements Runnable
{
	Q q;
	waiter(Q q)
	{
		this.q=q;
		new Thread(this,"waiter").start();
	}
	public void run()
	{
		while(true)
			q.getMeal();
	}
}
public class Q8a {
	public static void main(String [] args)
	{
		Q q=new Q();
		new chef(q);
		new waiter(q);
		
	}

}
