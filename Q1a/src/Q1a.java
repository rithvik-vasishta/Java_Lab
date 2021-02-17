import java.io.*;
import java.util.Scanner;
public class Q1a {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size");
		Implementation i=new Implementation(input.nextInt());
		
		while(true)
		{
			System.out.println("1:PUSH\n2:POP\n3:EXIT");
			int a=input.nextInt();
			if(a==1)
			{
				System.out.println("Enter number to push:");
				int m=input.nextInt();
				i.push(m);
			}
			else if(a==2)
			{
				System.out.println("The popped item is:"+i.pop());
			}
			else break;
		}
		
	}
}
