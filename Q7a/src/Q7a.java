import java.util.Scanner;

class record
{
	Scanner input=new Scanner(System.in);
	String [] name=new String[3];
	int [] rank=new int[3];
	record()
	{
		
	}
	void read()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter name ");
			name[i]=input.next();
			System.out.println("Enter rank");
			rank[i]=input.nextInt();
			
		}
		
	}
	void print()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("name: "+name[i]);
			//name[i]=input.next();
			System.out.println("rank"+rank[i]);
			//rank[i]=input.nextInt();
			
		}
	}
}
class rank extends record
{
	int index;
	rank(){}
	void high()
	{
		int max=0;
		for(int i=0;i<3;i++)
		{
			if(max<rank[i])
			{
				max=rank[i];
				index=i;
			}
		
		}
	}
	void print()
	{
		super.print();
		System.out.println("Topmost Rank : "+rank[index]);
		System.out.println("Rank holder Name : "+name[index]);
	}
}
public class Q7a {
	public static void main(String [] args)
	{
		rank r=new rank();
		r.read();
		r.high();
		r.print();
	}
	
}
