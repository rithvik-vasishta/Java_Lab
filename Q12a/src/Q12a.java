class mythrd extends Thread
{	int n;
	mythrd(int n)
	{
		this.n=n;
		System.out.println("Child Thread: "+this);
		
	}
	public void run()
	{
		
		try
		{
			Thread.sleep(1500);
			System.out.println("I am running:"+n);
		}catch(Exception e) {}
	}
}
public class Q12a {
	public static void main(String [] args)
	{
	Thread t=Thread.currentThread();
	System.out.println("Main Thread: "+t);
	t.setName("Main Thread");
	System.out.println("After name change: "+t);
	mythrd t1=new mythrd(1);
	mythrd t2=new mythrd(2);
	mythrd t3=new mythrd(3);
	mythrd t4=new mythrd(4);
	mythrd t5=new mythrd(5);
	t1.start();
	t2.start();
	t3.start();t4.start();t5.start();
	t1.setPriority(9);
	t2.setPriority(8);
	t3.setPriority(7);
	t4.setPriority(6);
	t5.setPriority(5);
	try
	{
		t1.sleep(400);
		t2.sleep(400);
	}catch(Exception e) {}
	System.out.println("Child 1 alive:"+t1.isAlive());
	System.out.println("Child 2 alive:"+t2.isAlive());
	System.out.println("Child 3 alive:"+t3.isAlive());
	System.out.println("Child 4 alive:"+t4.isAlive());
	System.out.println("Child 5 alive:"+t5.isAlive());
	try
	{
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
	}catch(Exception e) {}
	System.out.println("Child 1 alive:"+t1.isAlive());
	System.out.println("Child 2 alive:"+t2.isAlive());
	System.out.println("Child 3 alive:"+t3.isAlive());
	System.out.println("Child 4 alive:"+t4.isAlive());
	System.out.println("Child 5 alive:"+t5.isAlive());
	System.out.println(" alive:"+t.isAlive());
	
	}

}
