import java.util.Scanner;

public class Q11a {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		s=s.toUpperCase();
		int c=0;
		for(int i=0;i<s.length()-1;i++)
			if(s.charAt(i)==s.charAt(i+1))
				c+=1;
		System.out.println(s);
		System.out.println(c);
	}
}
