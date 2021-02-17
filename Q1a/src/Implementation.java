
public class Implementation implements DataStructure {
	private int [] a;
	private int top,n;
	Implementation(int n)
	{
		this.n=n;
		a=new int[n];
		top=-1;
	}

	@Override
	public void push(int m) {
		// TODO Auto-generated method stub
		if (isFull())
		{
			System.out.println("Stack is FULL");
			return;
		}
		a[++top]=m;
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("Stack is EMPTY");
			return -1;
		}
		return a[top--];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==-1)
			return true;
		else return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(top>=(n-1))
		return true;
		else return false;
	}

}
