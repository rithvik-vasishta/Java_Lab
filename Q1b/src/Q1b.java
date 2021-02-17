import java.sql.*;
import java.util.*;
public class Q1b {
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1b","root","root");
			Statement stmt=con.createStatement();
			stmt.execute("create table dept( deptid int,name varchar(10),year int,head varchar(10),noemp int,primary key (deptid))");
			PreparedStatement ps=con.prepareCall("Insert into dept values (?,?,?,?,?)");
			//int id,year,no;
			//String name,head;
			Scanner input=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter 0 to exit insertion");
				int x=input.nextInt();
				if(x==0)
					break;
				System.out.println("Enter ID");
				ps.setInt(1, input.nextInt());
				System.out.println("Enter NAME");
				ps.setString(2, input.next());
				System.out.println("Enter YearOfEstb");
				ps.setInt(3, input.nextInt());
				System.out.println("Enter HeadName");
				ps.setString(4, input.next());
				System.out.println("Enter NoOfEmployees");
				ps.setInt(5, input.nextInt());
				ps.executeUpdate();
			}
			ResultSet rs=stmt.executeQuery("select noemp from dept where name='CSE'");
			rs.next();
			System.out.println("The no of emps in CSE are:"+rs.getInt(1));
			rs=stmt.executeQuery("select name,deptid from dept where year=2010");
			while(rs.next())
			{
				System.out.print("ID:"+rs.getInt(2));
				System.out.println(" NAME:"+rs.getString(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
